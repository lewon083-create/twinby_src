package d;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15443c;

    public /* synthetic */ e(int i, Object obj) {
        this.f15442b = i;
        this.f15443c = obj;
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.n event) {
        Window window;
        View viewPeekDecorView;
        switch (this.f15442b) {
            case 0:
                n nVar = (n) this.f15443c;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.n.ON_STOP && (window = nVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                n.f((n) this.f15443c, uVar, event);
                break;
            default:
                g8.c cVar = (g8.c) this.f15443c;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == androidx.lifecycle.n.ON_START) {
                    cVar.f20011c = true;
                } else if (event == androidx.lifecycle.n.ON_STOP) {
                    cVar.f20011c = false;
                }
                break;
        }
    }
}
