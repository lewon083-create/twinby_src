package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f41114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f41115b;

    public n0(sk3 sk3Var, View view) {
        super(view);
        this.f41114a = sk3Var;
        this.f41115b = (TextView) view.findViewById(R$id.item_button);
    }

    @Override // yads.ea0
    public final void a(u90 u90Var) {
        TextView textView = this.f41115b;
        u90Var.getClass();
        textView.setText("Enable Test mode");
        this.f41115b.setOnClickListener(new zl.u(1, this, u90Var));
    }

    public static final void a(n0 n0Var, u90 u90Var, View view) {
        Function1 function1 = n0Var.f41114a;
        u90Var.getClass();
        function1.invoke(t90.f43245b);
    }
}
