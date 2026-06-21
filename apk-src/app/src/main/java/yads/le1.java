package yads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class le1 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f40512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f40513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f40514c;

    public le1(View view) {
        super(view);
        this.f40512a = (TextView) view.findViewById(R$id.item_title);
        this.f40513b = (TextView) view.findViewById(R$id.item_subtitle);
        this.f40514c = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        x90 x90Var = (x90) ba0Var;
        String str = x90Var.f44624a;
        x80 x80Var = x90Var.f44625b;
        q50 q50Var = x90Var.f44626c;
        Context context = this.itemView.getContext();
        if (str != null) {
            this.f40512a.setVisibility(0);
            this.f40512a.setText(str);
        } else {
            this.f40512a.setVisibility(8);
        }
        if (x80Var == null || StringsKt.D(x80Var.f44618a)) {
            this.f40513b.setVisibility(8);
        } else {
            this.f40513b.setVisibility(0);
            this.f40513b.setText(x80Var.f44618a);
            this.f40513b.setTextColor(ik.a(context, x80Var.f44619b));
            Integer num = x80Var.f44620c;
            this.f40513b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        }
        if (q50Var == null || StringsKt.D(q50Var.f42187a)) {
            this.f40514c.setVisibility(8);
            return;
        }
        this.f40514c.setVisibility(0);
        this.f40514c.setText(q50Var.f42187a);
        this.f40514c.setTextColor(ik.a(context, q50Var.f42188b));
    }
}
