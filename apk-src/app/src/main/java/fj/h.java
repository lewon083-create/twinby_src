package fj;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19352c;

    public /* synthetic */ h(long j10, int i) {
        this.f19351b = i;
        this.f19352c = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19351b) {
            case 0:
                if (((ij.m) obj).f21342b instanceof ij.l) {
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f19352c);
                }
                return Unit.f27471a;
            case 1:
                if (((ij.m) obj).f21342b instanceof ij.l) {
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f19352c);
                }
                return Unit.f27471a;
            default:
                ((t2.b) obj).e(wd.i.f35245b, Long.valueOf(this.f19352c));
                return null;
        }
    }
}
