package hi;

import com.google.android.gms.internal.ads.om1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f20562c;

    static {
        a aVar = new a("PLAIN_TEXT", 0);
        f20561b = aVar;
        f20562c = new a[]{aVar};
    }

    public static a a(String str) {
        for (a aVar : values()) {
            aVar.getClass();
            if ("text/plain".equals(str)) {
                return aVar;
            }
        }
        throw new NoSuchFieldException(om1.k("No such ClipboardContentFormat: ", str));
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20562c.clone();
    }
}
