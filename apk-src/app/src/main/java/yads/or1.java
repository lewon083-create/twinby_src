package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import yads.or1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class or1 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70 f41681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f41682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f41683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public et f41684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f41685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f41686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f41687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f41688h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f41689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f41690k;

    public or1(View view, z70 z70Var, vk3 vk3Var, wk3 wk3Var) {
        super(view);
        this.f41681a = z70Var;
        this.f41682b = vk3Var;
        this.f41683c = wk3Var;
        this.f41685e = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.f41686f = (ImageView) view.findViewById(R$id.item_logo);
        this.f41687g = (TextView) view.findViewById(R$id.item_name);
        this.f41688h = (ImageView) view.findViewById(R$id.navigation_icon);
        this.i = (TextView) view.findViewById(R$id.item_info_first);
        this.f41689j = (TextView) view.findViewById(R$id.item_info_second);
        this.f41690k = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    public static final void b(or1 or1Var, y90 y90Var, View view) {
        or1Var.f41682b.invoke(y90Var);
    }

    @Override // yads.ea0
    public final void a(final y90 y90Var) {
        Context context = this.itemView.getContext();
        this.f41687g.setText(y90Var.f44955a);
        x80 x80Var = y90Var.f44957c;
        if (x80Var != null) {
            this.i.setVisibility(0);
            this.i.setText(x80Var.f44618a);
            this.i.setTextAppearance(context, x80Var.f44621d);
            this.i.setTextColor(ik.a(this.itemView.getContext(), x80Var.f44619b));
            TextView textView = this.i;
            Integer num = x80Var.f44620c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            this.i.setVisibility(8);
        }
        q50 q50Var = y90Var.f44958d;
        this.f41689j.setText(q50Var.f42187a);
        this.f41689j.setTextAppearance(context, q50Var.f42189c);
        this.f41689j.setTextColor(ik.a(this.itemView.getContext(), q50Var.f42188b));
        LinearLayout linearLayout = this.f41685e;
        String str = y90Var.f44959e;
        linearLayout.setClickable(((str == null || StringsKt.D(str)) && y90Var.f44961g == null) ? false : true);
        String str2 = y90Var.f44959e;
        if (str2 == null || StringsKt.D(str2)) {
            this.f41690k.setVisibility(8);
        } else {
            this.f41690k.setVisibility(0);
            final int i = 0;
            this.f41685e.setOnClickListener(new View.OnClickListener(this) { // from class: zl.q0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ or1 f46628c;

                {
                    this.f46628c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            or1.a(this.f46628c, y90Var, view);
                            break;
                        default:
                            or1.b(this.f46628c, y90Var, view);
                            break;
                    }
                }
            });
        }
        this.f41686f.setImageResource(0);
        et etVar = this.f41684d;
        if (etVar != null) {
            ((zl.g1) etVar).a();
        }
        z70 z70Var = this.f41681a;
        String str3 = y90Var.f44956b;
        if (str3 == null) {
            str3 = "";
        }
        this.f41684d = z70Var.a(str3, this.f41686f);
        if (y90Var.f44961g == null) {
            this.f41688h.setVisibility(8);
            return;
        }
        this.f41688h.setVisibility(0);
        final int i10 = 1;
        this.f41685e.setOnClickListener(new View.OnClickListener(this) { // from class: zl.q0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ or1 f46628c;

            {
                this.f46628c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        or1.a(this.f46628c, y90Var, view);
                        break;
                    default:
                        or1.b(this.f46628c, y90Var, view);
                        break;
                }
            }
        });
    }

    public static final void a(or1 or1Var, y90 y90Var, View view) {
        or1Var.f41683c.invoke(y90Var.f44959e);
    }
}
