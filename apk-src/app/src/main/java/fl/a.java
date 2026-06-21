package fl;

import com.google.android.gms.internal.ads.rq;
import dl.j;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import nl.g;
import nl.i;
import nl.l;
import nl.x;
import nl.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq f19482d;

    public a(rq rqVar) {
        this.f19482d = rqVar;
        this.f19480b = new l(((i) rqVar.f10022d).timeout());
    }

    @Override // nl.x
    public long D(g sink, long j10) throws IOException {
        rq rqVar = this.f19482d;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((i) rqVar.f10022d).D(sink, j10);
        } catch (IOException e3) {
            ((j) rqVar.f10021c).k();
            a();
            throw e3;
        }
    }

    public final void a() {
        rq rqVar = this.f19482d;
        int i = rqVar.f10019a;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            rq.i(rqVar, this.f19480b);
            rqVar.f10019a = 6;
        } else {
            throw new IllegalStateException("state: " + rqVar.f10019a);
        }
    }

    @Override // nl.x
    public final z timeout() {
        return this.f19480b;
    }
}
