package el;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import nl.i;
import nl.r;
import zk.f0;
import zk.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f16446d;

    public g(String str, long j10, r source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16444b = str;
        this.f16445c = j10;
        this.f16446d = source;
    }

    @Override // zk.f0
    public final long b() {
        return this.f16445c;
    }

    @Override // zk.f0
    public final p d() {
        String str = this.f16444b;
        if (str == null) {
            return null;
        }
        Pattern pattern = p.f46432d;
        return a.a.l(str);
    }

    @Override // zk.f0
    public final i h() {
        return this.f16446d;
    }
}
