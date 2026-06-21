package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f28337b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q f28338c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1 f28339a;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return x1.e(i, mode);
    }

    public static synchronized void c() {
        if (f28338c == null) {
            q qVar = new q();
            f28338c = qVar;
            qVar.f28339a = x1.b();
            x1 x1Var = f28338c.f28339a;
            t.x1 x1Var2 = new t.x1();
            x1Var2.f33317b = new int[]{2131165300, 2131165298, 2131165224};
            x1Var2.f33318c = new int[]{2131165248, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            x1Var2.f33319d = new int[]{2131165297, 2131165299, 2131165241, R.drawable.abc_text_cursor_material, 2131165294, 2131165295, 2131165296};
            x1Var2.f33320e = new int[]{2131165273, R.drawable.abc_cab_background_internal_bg, 2131165272};
            x1Var2.f33321f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            x1Var2.f33322g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (x1Var) {
                x1Var.f28402e = x1Var2;
            }
        }
    }

    public static void d(Drawable drawable, t2 t2Var, int[] iArr) {
        PorterDuff.Mode mode = x1.f28395f;
        int[] state = drawable.getState();
        int[] iArr2 = w0.f28391a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = t2Var.f28366b;
        if (!z5 && !t2Var.f28365a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z5 ? (ColorStateList) t2Var.f28367c : null;
        PorterDuff.Mode mode2 = t2Var.f28365a ? (PorterDuff.Mode) t2Var.f28368d : x1.f28395f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = x1.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.f28339a.c(context, i);
    }
}
