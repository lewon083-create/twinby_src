package d9;

import android.content.Context;
import e9.h;
import e9.i;
import fh.nd;
import fh.of;
import ka.k;
import s7.g;
import y8.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj.a f15731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj.a f15732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a9.b f15733d;

    public /* synthetic */ e(hj.a aVar, hj.a aVar2, a9.b bVar, int i) {
        this.f15730a = i;
        this.f15731b = aVar;
        this.f15732c = aVar2;
        this.f15733d = bVar;
    }

    @Override // hj.a
    public final Object get() {
        switch (this.f15730a) {
            case 0:
                return new k((Context) this.f15731b.get(), (f9.d) this.f15732c.get(), (e9.a) ((d) this.f15733d).get(), 9);
            default:
                return new q(new of(), new nd(), (c) ((b) this.f15731b).get(), (com.google.android.gms.internal.consent_sdk.c) ((h) this.f15732c).get(), (g) ((i) this.f15733d).get());
        }
    }
}
