package ma;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f28797d;

    public /* synthetic */ q(boolean z5, String str, p pVar) {
        this.f28795b = z5;
        this.f28796c = str;
        this.f28797d = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        int i = 0;
        boolean z5 = this.f28795b;
        String str = this.f28796c;
        p pVar = this.f28797d;
        String str2 = (z5 || !s.b(str, pVar, true, false).f28813a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        c0.i(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + ua.b.b(messageDigest.digest(pVar.f28794d)) + ", atk=" + z5 + ", ver=12451000.false";
    }
}
