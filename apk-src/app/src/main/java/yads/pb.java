package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pb extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f41862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f41863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f41864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f41865d;

    public pb(yk3 yk3Var, View view) {
        super(view);
        this.f41862a = yk3Var;
        this.f41863b = (TextView) view.findViewById(R$id.item_name);
        this.f41864c = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.f41865d = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    @Override // yads.ea0
    public final void a(r90 r90Var) {
        this.f41863b.setText(r90Var.f42520a);
        this.f41864c.setText(r90Var.f42521b);
        this.f41865d.setText(r90Var.f42522c);
        this.itemView.setOnClickListener(new zl.u(2, this, r90Var));
    }

    public static final void a(pb pbVar, r90 r90Var, View view) {
        pbVar.f41862a.invoke(r90Var.f42522c);
    }
}
