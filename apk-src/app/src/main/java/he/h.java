package he;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f20516e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20517a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f20519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f20520d;

    static {
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(Executor executor, c cVar, c cVar2) {
        this.f20518b = executor;
        this.f20519c = cVar;
        this.f20520d = cVar2;
    }

    public static HashSet a(c cVar) {
        HashSet hashSet = new HashSet();
        d dVarC = cVar.c();
        if (dVarC != null) {
            Iterator<String> itKeys = dVarC.f20496b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
