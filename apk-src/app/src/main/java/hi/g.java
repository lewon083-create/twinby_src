package hi;

import android.util.Log;
import ii.p;
import ii.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20595c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f20593a = i;
        this.f20595c = obj;
        this.f20594b = obj2;
    }

    @Override // ii.p
    public final void a() {
        switch (this.f20593a) {
            case 0:
                break;
            default:
                ((zh.f) this.f20594b).a(null);
                break;
        }
    }

    @Override // ii.p
    public final void b(String str, String str2, Object obj) {
        switch (this.f20593a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((zh.f) this.f20594b).a(((q) ((h3.e) this.f20595c).f20376d).f21319c.d(str, str2, obj));
                break;
        }
    }

    @Override // ii.p
    public final void success(Object obj) {
        switch (this.f20593a) {
            case 0:
                ((h) this.f20595c).f20600e = (byte[]) this.f20594b;
                break;
            default:
                ((zh.f) this.f20594b).a(((q) ((h3.e) this.f20595c).f20376d).f21319c.b(obj));
                break;
        }
    }

    private final void c() {
    }
}
