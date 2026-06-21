package yads;

import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n90 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o90 f41202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(o90 o90Var) {
        super(0);
        this.f41202b = o90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        synchronized (gu1.f38874a) {
            gu1.f38875b = true;
        }
        o90 o90Var = this.f41202b;
        Toast.makeText(o90Var.f41494a, o90Var.f41494a.getString(R$string.debug_panel_logging_is_enabled), 0).show();
        return Unit.f27471a;
    }
}
