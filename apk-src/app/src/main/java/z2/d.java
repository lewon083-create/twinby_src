package z2;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f45822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f45823d;

    public /* synthetic */ d(m mVar, q0 q0Var, int i) {
        this.f45821b = i;
        this.f45822c = mVar;
        this.f45823d = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45821b) {
            case 0:
                m this$0 = this.f45822c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                q0 operation = this.f45823d;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.a(operation);
                break;
            case 1:
                m this$02 = this.f45822c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                q0 operation2 = this.f45823d;
                Intrinsics.checkNotNullParameter(operation2, "$operation");
                if (this$02.f45899b.contains(operation2)) {
                    s0 s0Var = operation2.f45937a;
                    View view = operation2.f45939c.G;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    s0Var.a(view, this$02.f45898a);
                }
                break;
            default:
                m this$03 = this.f45822c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                q0 operation3 = this.f45823d;
                Intrinsics.checkNotNullParameter(operation3, "$operation");
                this$03.f45899b.remove(operation3);
                this$03.f45900c.remove(operation3);
                break;
        }
    }
}
