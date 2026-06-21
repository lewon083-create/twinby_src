package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class de3 {
    public static ee3 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new ee3(str);
    }

    public static ee3 b() {
        return new ee3("Server temporarily unavailable. Please, try again later.");
    }

    public static ee3 b(String str) {
        return new ee3(str);
    }

    public static ee3 a(am0 am0Var) {
        String message = am0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        return new ee3(message);
    }

    public static ee3 a() {
        return new ee3("Internal error. Failed to parse response");
    }
}
