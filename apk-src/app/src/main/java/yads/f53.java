package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function2;
import yads.f53;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f53 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f38383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Switch f38384b;

    public f53(View view, uk3 uk3Var) {
        super(view);
        this.f38383a = uk3Var;
        this.f38384b = (Switch) view.findViewById(R$id.item_switch);
    }

    @Override // yads.ea0
    public final void a(final aa0 aa0Var) {
        this.f38384b.setOnCheckedChangeListener(null);
        Switch r02 = this.f38384b;
        aa0Var.getClass();
        r02.setText("Debug Error Indicator");
        this.f38384b.setChecked(aa0Var.f36667a);
        this.f38384b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zl.i
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                f53.a(this.f46587a, aa0Var, compoundButton, z5);
            }
        });
    }

    public static final void a(f53 f53Var, aa0 aa0Var, CompoundButton compoundButton, boolean z5) {
        Function2 function2 = f53Var.f38383a;
        aa0Var.getClass();
        function2.invoke(z90.f45283b, Boolean.valueOf(z5));
    }
}
