package yads;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tj1 implements pi, pf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e51 f43342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un1 f43343b;

    public tj1(e51 e51Var, un1 un1Var) {
        this.f43342a = e51Var;
        this.f43343b = un1Var;
    }

    @Override // yads.pi
    public final void a() {
        un1 un1Var;
        e51 e51Var;
        ImageView imageView = (ImageView) a((kk3) this.f43342a);
        if (imageView != null && (e51Var = this.f43342a) != null) {
            imageView.setImageDrawable(null);
            e51Var.f38018e.a(imageView);
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setSelected(false);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kk3) this.f43343b);
        if (customizableMediaView == null || (un1Var = this.f43343b) == null) {
            return;
        }
        un1Var.a((View) customizableMediaView);
    }

    @Override // yads.pi
    public final boolean b() {
        un1 un1Var = this.f43343b;
        if (un1Var != null && un1Var.b() != null) {
            return true;
        }
        e51 e51Var = this.f43342a;
        return (e51Var == null || e51Var.b() == null) ? false : true;
    }

    @Override // yads.pi
    public final cl3 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kk3) this.f43343b);
        ImageView imageView = (ImageView) a((kk3) this.f43342a);
        if (customizableMediaView != null) {
            return new cl3(customizableMediaView.getWidth(), customizableMediaView.getHeight());
        }
        if (imageView != null) {
            return new cl3(imageView.getWidth(), imageView.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final boolean d() {
        un1 un1Var = this.f43343b;
        boolean z5 = un1Var != null && nl3.a(un1Var.b()) >= 100;
        e51 e51Var = this.f43342a;
        return z5 || (e51Var != null && nl3.a(e51Var.b()) >= 100);
    }

    @Override // yads.pi
    public final boolean e() {
        e51 e51Var;
        un1 un1Var = this.f43343b;
        return (un1Var != null && un1Var.c()) || ((e51Var = this.f43342a) != null && e51Var.c());
    }

    @Override // yads.pf0
    public final void b(Object obj) {
        qn1 qn1Var = (qn1) obj;
        w41 w41VarA = a(qn1Var.f42352c);
        ImageView imageView = (ImageView) a((kk3) this.f43342a);
        if (imageView != null && w41VarA != null) {
            e51 e51Var = this.f43342a;
            if (e51Var != null) {
                e51Var.a(w41VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kk3) this.f43343b);
        if (customizableMediaView == null) {
            return;
        }
        un1 un1Var = this.f43343b;
        if (un1Var != null) {
            un1Var.a(qn1Var);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // yads.pi
    public final void c(Object obj) {
        qn1 qn1Var = (qn1) obj;
        w41 w41VarA = a(qn1Var.f42352c);
        ImageView imageView = (ImageView) a((kk3) this.f43342a);
        if (imageView != null && w41VarA != null) {
            e51 e51Var = this.f43342a;
            if (e51Var != null) {
                e51Var.a(w41VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((kk3) this.f43343b);
        if (customizableMediaView != null) {
            un1 un1Var = this.f43343b;
            if (un1Var != null) {
                un1Var.b(customizableMediaView, qn1Var);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // yads.pi
    public final void a(oi oiVar, nk3 nk3Var) {
        qn1 qn1Var = (qn1) oiVar.f41542c;
        e51 e51Var = this.f43342a;
        if (e51Var != null) {
            e51Var.a(oiVar, nk3Var, a(qn1Var.f42352c));
        }
        un1 un1Var = this.f43343b;
        if (un1Var != null) {
            un1Var.a(oiVar, nk3Var, qn1Var);
        }
    }

    public static View a(kk3 kk3Var) {
        if (kk3Var != null) {
            return kk3Var.b();
        }
        return null;
    }

    public static w41 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (w41) list.get(0);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        qn1 qn1Var = (qn1) obj;
        e51 e51Var = this.f43342a;
        w41 w41VarA = a(qn1Var.f42352c);
        View viewA = a((kk3) e51Var);
        boolean z5 = (viewA == null || w41VarA == null || e51Var == null || !e51Var.a(viewA, w41VarA)) ? false : true;
        un1 un1Var = this.f43343b;
        View viewA2 = a((kk3) un1Var);
        return z5 || (viewA2 != null && un1Var != null && un1Var.a(viewA2, qn1Var));
    }
}
