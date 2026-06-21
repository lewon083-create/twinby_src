package g2;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.i f19949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f19950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f19951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19952d;

    public y0(ac.i iVar) {
        super(0);
        this.f19952d = new HashMap();
        this.f19949a = iVar;
    }

    public final b1 a(WindowInsetsAnimation windowInsetsAnimation) {
        b1 b1Var = (b1) this.f19952d.get(windowInsetsAnimation);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(0, null, 0L);
        b1Var2.f19835a = new z0(windowInsetsAnimation);
        this.f19952d.put(windowInsetsAnimation, b1Var2);
        return b1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.f19949a.f758d).setTranslationY(0.0f);
        this.f19952d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ac.i iVar = this.f19949a;
        View view = (View) iVar.f758d;
        int[] iArr = (int[]) iVar.f759e;
        view.getLocationOnScreen(iArr);
        iVar.f755a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f19951c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f19951c = arrayList2;
            this.f19950b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = c6.a.l(list.get(size));
            b1 b1VarA = a(windowInsetsAnimationL);
            b1VarA.f19835a.d(windowInsetsAnimationL.getFraction());
            this.f19951c.add(b1VarA);
        }
        x1 x1VarG = x1.g(null, windowInsets);
        this.f19949a.i(x1VarG, this.f19950b);
        return x1VarG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        x1.b bVarC = x1.b.c(bounds.getLowerBound());
        x1.b bVarC2 = x1.b.c(bounds.getUpperBound());
        ac.i iVar = this.f19949a;
        View view = (View) iVar.f758d;
        int[] iArr = (int[]) iVar.f759e;
        view.getLocationOnScreen(iArr);
        int i = iVar.f755a - iArr[1];
        iVar.f756b = i;
        view.setTranslationY(i);
        c6.a.n();
        return c6.a.j(bVarC.d(), bVarC2.d());
    }
}
