package ii;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21306a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ka.k f21307b;

    public g(ka.k kVar) {
        this.f21307b = kVar;
    }

    public final void a(String str, String str2) {
        if (this.f21306a.get()) {
            return;
        }
        ka.k kVar = this.f21307b;
        if (((AtomicReference) kVar.f27325d).get() != this) {
            return;
        }
        i iVar = (i) kVar.f27326e;
        iVar.f21308a.f(iVar.f21309b, iVar.f21310c.d(str, str2, null));
    }

    public final void b(Object obj) {
        if (this.f21306a.get()) {
            return;
        }
        ka.k kVar = this.f21307b;
        if (((AtomicReference) kVar.f27325d).get() != this) {
            return;
        }
        i iVar = (i) kVar.f27326e;
        iVar.f21308a.f(iVar.f21309b, iVar.f21310c.b(obj));
    }
}
