package d8;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15593b;

    public /* synthetic */ d0(int i, Object obj) {
        this.f15592a = i;
        this.f15593b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f15592a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((p) this.f15593b).onProductDetailsResponse((j) obj, arrayList);
                break;
            case 1:
                ((jh.b) ((s3.q) this.f15593b).f32631c).e(ya.e.h((j) obj));
                break;
            default:
                ((s3.q) this.f15593b).e((j) obj);
                break;
        }
    }

    public /* synthetic */ d0(k kVar, s3.q qVar) {
        this.f15592a = 1;
        this.f15593b = qVar;
    }
}
