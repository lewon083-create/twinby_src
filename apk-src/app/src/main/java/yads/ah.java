package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36711c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.14.2 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f36712d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.14.2 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd3 f36713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f36714b;

    public /* synthetic */ ah(Context context) {
        this(new sd3(), pg.a(context));
    }

    public final void a() {
        String libraryVersion;
        this.f36714b.getClass();
        try {
            libraryVersion = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            libraryVersion = null;
        }
        if (libraryVersion == null) {
            String str = f36711c;
            throw new wb1(str, str);
        }
        this.f36713a.getClass();
        rd3 rd3VarA = sd3.a("7.14.2");
        if (rd3VarA == null) {
            return;
        }
        this.f36713a.getClass();
        rd3 rd3VarA2 = sd3.a("8.0.0");
        if (rd3VarA2 == null) {
            return;
        }
        this.f36713a.getClass();
        rd3 rd3VarA3 = sd3.a(libraryVersion);
        if (rd3VarA3 == null || rd3VarA3.compareTo(rd3VarA) < 0 || rd3VarA3.compareTo(rd3VarA2) >= 0) {
            String strA = a(libraryVersion);
            throw new wb1(strA, strA);
        }
    }

    public ah(sd3 sd3Var, fh fhVar) {
        this.f36713a = sd3Var;
        this.f36714b = fhVar;
    }

    public static String a(String str) {
        return com.google.android.gms.internal.ads.om1.x(f36712d, str);
    }
}
