package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rb extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f42525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f42526b;

    public rb(View view, xk3 xk3Var) {
        super(view);
        this.f42525a = xk3Var;
        this.f42526b = (TextView) view.findViewById(R$id.item_text);
    }

    public final void a() {
        this.f42526b.setText(this.itemView.getContext().getString(R$string.debug_panel_ad_units));
        this.f42526b.setOnClickListener(new gh.a(6, this));
    }

    @Override // yads.ea0
    public final /* bridge */ /* synthetic */ void a(ba0 ba0Var) {
        a();
    }

    public static final void a(rb rbVar, View view) {
        rbVar.f42525a.invoke();
    }
}
