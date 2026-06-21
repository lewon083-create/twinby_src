package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.om1;
import java.lang.reflect.Constructor;
import l.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public CharSequence A;
    public final /* synthetic */ f D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f26727a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26734h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f26736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f26737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f26739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f26741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f26744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f26745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f26746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f26749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f26750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f26751z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26728b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26729c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26730d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26731e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26732f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26733g = true;

    public e(f fVar, Menu menu) {
        this.D = fVar;
        this.f26727a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f26756c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        f fVar = this.D;
        Context context = fVar.f26756c;
        boolean z5 = false;
        menuItem.setChecked(this.f26744s).setVisible(this.f26745t).setEnabled(this.f26746u).setCheckable(this.f26743r >= 1).setTitleCondensed(this.f26737l).setIcon(this.f26738m);
        int i = this.f26747v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f26750y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (fVar.f26757d == null) {
                fVar.f26757d = f.a(context);
            }
            Object obj = fVar.f26757d;
            String str = this.f26750y;
            d dVar = new d();
            dVar.f26725a = obj;
            Class<?> cls = obj.getClass();
            try {
                dVar.f26726b = cls.getMethod(str, d.f26724c);
                menuItem.setOnMenuItemClickListener(dVar);
            } catch (Exception e3) {
                StringBuilder sbP = om1.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbP.append(cls.getName());
                InflateException inflateException = new InflateException(sbP.toString());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f26743r >= 2 && (menuItem instanceof j)) {
            j jVar = (j) menuItem;
            jVar.f27670x = (jVar.f27670x & (-5)) | 4;
        }
        String str2 = this.f26749x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, f.f26752e, fVar.f26754a));
            z5 = true;
        }
        int i10 = this.f26748w;
        if (i10 > 0) {
            if (z5) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        CharSequence charSequence = this.f26751z;
        boolean z10 = menuItem instanceof j;
        if (z10) {
            ((j) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.a.n(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z10) {
            ((j) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.a.r(menuItem, charSequence2);
        }
        char c8 = this.f26739n;
        int i11 = this.f26740o;
        if (z10) {
            ((j) menuItem).setAlphabeticShortcut(c8, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.a.m(menuItem, c8, i11);
        }
        char c9 = this.f26741p;
        int i12 = this.f26742q;
        if (z10) {
            ((j) menuItem).setNumericShortcut(c9, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a2.a.q(menuItem, c9, i12);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z10) {
                ((j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a2.a.p(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z10) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a2.a.o(menuItem, colorStateList);
            }
        }
    }
}
