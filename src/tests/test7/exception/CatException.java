package tests.test7.exception;

public class CatException extends Exception {
    /**
     * <a href="https://www.asciiart.eu/animals/cats">ASCII Art Archive</a>
     **/
    public static final String ASCII_ART = """
        Art by Marcin Glinski
               ,
               \\`-._           __
                \\\\  `-..____,.'  `.
                 :`.         /    \\`.
                 :  )       :      : \\
                  ;'        '   ;  |  :
                  )..      .. .:.`.;  :
                 /::...  .:::...   ` ;
                 ; _ '    __        /:\\
                 `:o>   /\\o_>      ;:. `.
                `-`.__ ;   __..--- /:.   \\
                === \\_/   ;=====_.':.     ;
                 ,/'`--'...`--....        ;
                      ;                    ;
                    .'                      ;
                  .'                        ;
                .'     ..     ,      .       ;
               :       ::..  /      ;::.     |
              /      `.;::.  |       ;:..    ;
             :         |:.   :       ;:.    ;
             :         ::     ;:..   |.    ;
              :       :;      :::....|     |
              /\\     ,/ \\      ;:::::;     ;
            .:. \\:..|    :     ; '.--|     ;
           ::.  :''  `-.,,;     ;'   ;     ;
        .-'. _.'\\      / `;      \\,__:      \\
        `---'    `----'   ;      /    \\,.,,,/
                           `----`              fsc
        """;

    public CatException() {
        super(ASCII_ART);
    }

    public CatException(String message) {
        super(ASCII_ART);
    }

    public CatException(String message, Throwable cause) {
        super(ASCII_ART, cause);
    }

    public CatException(Throwable cause) {
        super(ASCII_ART, cause);
    }

    protected CatException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(ASCII_ART, cause, enableSuppression, writableStackTrace);
    }
}
