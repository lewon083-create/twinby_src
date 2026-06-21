package yads;

import io.sentry.protocol.Browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zu f45532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zu f45533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zu[] f45534e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45535b;

    static {
        zu zuVar = new zu(0, "INTERNAL_BROWSER", "internal_browser");
        f45532c = zuVar;
        zu zuVar2 = new zu(1, "BROWSER", Browser.TYPE);
        f45533d = zuVar2;
        zu[] zuVarArr = {zuVar, zuVar2, new zu(2, "UNKNOWN", "unknown")};
        f45534e = zuVarArr;
        hl.d.k(zuVarArr);
    }

    public zu(int i, String str, String str2) {
        this.f45535b = str2;
    }

    public static zu valueOf(String str) {
        return (zu) Enum.valueOf(zu.class, str);
    }

    public static zu[] values() {
        return (zu[]) f45534e.clone();
    }
}
