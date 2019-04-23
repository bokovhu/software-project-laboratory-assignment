grammar PandaLanguage;

parse
	: ( expression | error )* (SEMICOLON | NEWLINE)* EOF
	;

error
	: UNEXPECTED_CHAR 
		{ 
			throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text); 
		}
	;

expression
	: (pandalang_command | shell_command) NEWLINE*
	;

pandalang_command
	: (SEMICOLON | NEWLINE)* (
		pl_cmd_add
		| pl_cmd_work
		| pl_cmd_connect
		| pl_cmd_move
		| pl_cmd_use
		| pl_cmd_push
		| pl_cmd_pop
		| pl_cmd_begin
		| pl_cmd_end
		| pl_cmd_set
		| pl_cmd_release
	) SEMICOLON+
	;

shell_command
	: SLASH (
		sh_cmd_print
		| sh_cmd_save
		| sh_cmd_load
		| sh_cmd_clear
	)
	;

// Panda language commands

pl_cmd_add
	: pl_cmd_add_tile
	| pl_cmd_add_panda
	| pl_cmd_add_vendingmachine
	| pl_cmd_add_gamemachine
	| pl_cmd_add_couch
	| pl_cmd_add_wardrobe
	| pl_cmd_add_orangutan
	;

pl_cmd_work
	: (pl_cmd_work_specific | pl_cmd_work_all)
	;

pl_cmd_work_specific
    : KW_WORK (KW_GAMEMACHINE | KW_VENDINGMACHINE | KW_COUCH | KW_WARDROBE | KW_PANDA | KW_ORANGUTAN) KW_WITH KW_ID IDENTIFIER
    ;

pl_cmd_work_all
    : KW_WORK ASTERISK
    ;

pl_cmd_connect
	: pl_cmd_connect_tile
	| pl_cmd_connect_wardrobe
	;

pl_cmd_move
	: KW_MOVE KW_ORANGUTAN KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
	;

pl_cmd_use
	: KW_USE (KW_GAMEMACHINE | KW_VENDINGMACHINE | KW_COUCH | KW_WARDROBE) KW_WITH KW_ID IDENTIFIER KW_BY (KW_ORANGUTAN | KW_PANDA) KW_WITH KW_ID IDENTIFIER
	;

pl_cmd_push
	: KW_PUSH
	;

pl_cmd_pop
	: KW_POP
	;

pl_cmd_begin
	: KW_BEGIN
	;

pl_cmd_end
	: KW_END
	;

pl_cmd_set
	: KW_SET WORD (WORD WHITESPACE?)+
	;

pl_cmd_release
    : KW_RELEASE (KW_PANDA | KW_ORANGUTAN) KW_WITH KW_ID IDENTIFIER
    ;

// ADD commands

pl_cmd_add_tile
	: KW_ADD (tile_flag)* KW_TILE KW_WITH KW_ID IDENTIFIER
	;

pl_cmd_add_panda
	: KW_ADD panda_flag KW_PANDA KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
	;

pl_cmd_add_vendingmachine
	: KW_ADD KW_VENDINGMACHINE KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
	;

pl_cmd_add_gamemachine
	: KW_ADD KW_GAMEMACHINE KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
	;

pl_cmd_add_couch
	: KW_ADD KW_COUCH KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
	;

pl_cmd_add_wardrobe
	: KW_ADD KW_WARDROBE KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
	;

pl_cmd_add_orangutan
    : KW_ADD KW_ORANGUTAN KW_WITH KW_ID IDENTIFIER KW_ONTO KW_TILE IDENTIFIER
    ;

// CONNECT commands

pl_cmd_connect_tile
	: KW_CONNECT KW_TILE IDENTIFIER KW_WITH KW_TILE IDENTIFIER
	;

pl_cmd_connect_wardrobe
	: KW_CONNECT KW_WARDROBE IDENTIFIER KW_WITH KW_WARDROBE IDENTIFIER
	;

// PL helpers

tile_flag
	: KW_FRAGILE
	| KW_EXIT
	| KW_START
	;

panda_flag
	: KW_COWARD
	| KW_SLEEPY
	| KW_JUMPY
	;

// Shell commands

sh_cmd_print
	: 'print' FILENAME?
	;

sh_cmd_save
	: 'save' FILENAME
	;

sh_cmd_load
	: 'load' FILENAME
	;

sh_cmd_clear
	: 'clear'
	;

FILENAME
	: '"' FILENAME_CHAR+ '"'
	;

// Command keywords
KW_ADD : A D D;
KW_CONNECT : C O N N E C T;
KW_BEGIN : B E G I N;
KW_END : E N D;
KW_MOVE : M O V E;
KW_USE : U S E;
KW_WORK : W O R K;
KW_PUSH : P U S H;
KW_POP : P O P;
KW_SET : S E T;
KW_RELEASE : R E L E A S E;

// Keywords for identifying type of things
KW_TILE : T I L E;
KW_PANDA : P A N D A;
KW_ORANGUTAN : O R A N G U T A N;
KW_VENDINGMACHINE : V E N D I N G M A C H I N E;
KW_WARDROBE : W A R D R O B E;
KW_GAMEMACHINE : G A M E M A C H I N E;
KW_COUCH : C O U C H;

// Tile flag keywords
KW_FRAGILE : F R A G I L E;
KW_EXIT : E X I T;
KW_START : S T A R T;

// Panda flag keywords
KW_COWARD : C O W A R D;
KW_SLEEPY : S L E E P Y;
KW_JUMPY : J U M P Y;

// Property keywords
KW_CURRENTANIMAL : C U R R E N T A N I M A L;
KW_CURRENTITEM : C U R R E N T I T E M;
KW_PLACEDON : P L A C E D O N;
KW_STANDINGON : S T A N D I N G O N;
KW_SLEEPINGIN : S L E E P I N G I N;
KW_LEADERANIMAL : L E A D E R A N I M A L;
KW_GUIDEDANIMAL : G U I D E D A N I M A L;
KW_THEFTTIMER : T H E F T T I M E R;

// Other keywords
KW_NULL : N U L L;
KW_WITH : W I T H;
KW_ID : I D;
KW_ONTO : O N T O;
KW_CONNECTED : C O N N E C T E D;
KW_BY : B Y;

IDENTIFIER : DIGIT+;

// Skip whitespace
WHITESPACE : [ \t]+ -> channel(HIDDEN);
NEWLINE : '\r'? '\n';
COMMENT: '#' ~[\r\n]* -> channel(HIDDEN);
SEMICOLON : ';';
LEFTPAR : '(';
RIGHTPAR : ')';
EQUALS : '=';
SLASH : '/';
WORD : (LETTER | DIGIT | [\-_])+;
ASTERISK : '*';

UNEXPECTED_CHAR
	: .
	;

fragment DIGIT : [0-9];
fragment LETTER : [a-zA-Z];
fragment FILENAME_CHAR : ~["\r\n];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
