package f9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj.a f16706b;

    public /* synthetic */ e(hj.a aVar, int i) {
        this.f16705a = i;
        this.f16706b = aVar;
    }

    @Override // hj.a
    public final Object get() {
        switch (this.f16705a) {
            case 0:
                String packageName = ((Context) this.f16706b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new m((Context) this.f16706b.get(), "com.google.android.datatransport.events", Integer.valueOf(m.f16723e).intValue());
        }
    }
}
