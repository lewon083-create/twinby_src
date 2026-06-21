package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import g2.o0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m.w2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i implements Menu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f27627v = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f27629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m.i f27632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f27633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f27634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27635h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f27636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f27638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f27639m;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f27646t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27640n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27641o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27642p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27643q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f27644r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f27645s = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27647u = false;

    public i(Context context) {
        boolean zR;
        boolean z5 = false;
        this.f27628a = context;
        Resources resources = context.getResources();
        this.f27629b = resources;
        this.f27633f = new ArrayList();
        this.f27634g = new ArrayList();
        this.f27635h = true;
        this.i = new ArrayList();
        this.f27636j = new ArrayList();
        this.f27637k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = o0.f19905a;
            if (Build.VERSION.SDK_INT >= 28) {
                zR = c2.f.r(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zR = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zR) {
                z5 = true;
            }
        }
        this.f27631d = z5;
    }

    public final j a(int i, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f27627v[i13] << 16) | (65535 & i11);
        j jVar = new j(this, i, i10, i11, i14, charSequence);
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((j) arrayList.get(size)).f27651d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, jVar);
        o(true);
        return jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f27628a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j jVarA = a(i, i10, i11, resolveInfo.loadLabel(packageManager));
            jVarA.setIcon(resolveInfo.loadIcon(packageManager));
            jVarA.f27654g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = jVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f27645s.add(new WeakReference(pVar));
        pVar.f(context, this);
        this.f27637k = true;
    }

    public final void c(boolean z5) {
        if (this.f27643q) {
            return;
        }
        this.f27643q = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f27645s;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.b(this, z5);
            }
        }
        this.f27643q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f27646t;
        if (jVar != null) {
            d(jVar);
        }
        this.f27633f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f27638l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f27645s;
        boolean zH = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f27646t == jVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar != null) {
                    zH = pVar.h(jVar);
                    if (zH) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zH) {
                this.f27646t = null;
            }
        }
        return zH;
    }

    public boolean e(i iVar, MenuItem menuItem) {
        m.m mVar;
        m.i iVar2 = this.f27632e;
        return (iVar2 == null || (mVar = ((ActionMenuView) iVar2.f28257b).f1127z) == null || !((w2) mVar).f28394a.H.a()) ? false : true;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f27645s;
        boolean zA = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar != null) {
                zA = pVar.a(jVar);
                if (zA) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zA) {
            this.f27646t = jVar;
        }
        return zA;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f27648a == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.f27661o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final j g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f27644r;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean zM = m();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            char c8 = zM ? jVar.f27656j : jVar.f27655h;
            char[] cArr = keyData.meta;
            if ((c8 == cArr[0] && (metaState & 2) == 0) || ((c8 == cArr[2] && (metaState & 2) != 0) || (zM && c8 == '\b' && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f27633f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f27633f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = (j) arrayList.get(i10);
                if (jVar.hasSubMenu()) {
                    jVar.f27661o.h(list, i, keyEvent);
                }
                char c8 = zM ? jVar.f27656j : jVar.f27655h;
                if ((modifiers & 69647) == ((zM ? jVar.f27657k : jVar.i) & 69647) && c8 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c8 == cArr[0] || c8 == cArr[2] || (zM && c8 == '\b' && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((j) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f27637k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f27645s;
            boolean zC = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC |= pVar.c();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f27636j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i = 0; i < size; i++) {
                    j jVar = (j) arrayListK.get(i);
                    if ((jVar.f27670x & 32) == 32) {
                        arrayList.add(jVar);
                    } else {
                        arrayList2.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f27637k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z5 = this.f27635h;
        ArrayList arrayList = this.f27634g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f27633f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) arrayList2.get(i);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f27635h = false;
        this.f27637k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f27647u;
    }

    public boolean m() {
        return this.f27630c;
    }

    public boolean n() {
        return this.f27631d;
    }

    public final void o(boolean z5) {
        if (this.f27640n) {
            this.f27641o = true;
            if (z5) {
                this.f27642p = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f27635h = true;
            this.f27637k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f27645s;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.d();
            }
        }
        r();
    }

    public final boolean p(MenuItem menuItem, k kVar, int i) {
        boolean zExpandActionView;
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        i iVar = jVar.f27660n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = jVar.f27662p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(jVar)) && !iVar.e(iVar, jVar)) {
            Intent intent = jVar.f27654g;
            if (intent != null) {
                try {
                    iVar.f27628a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e3) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    zExpandActionView = false;
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((jVar.f27671y & 8) != 0 && jVar.f27672z != null) {
            zExpandActionView |= jVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (jVar.hasSubMenu()) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!jVar.hasSubMenu()) {
                t tVar = new t(this.f27628a, this, jVar);
                jVar.f27661o = tVar;
                tVar.setHeaderTitle(jVar.f27652e);
            }
            t tVar2 = jVar.f27661o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f27645s;
            if (!copyOnWriteArrayList.isEmpty()) {
                zG = kVar != null ? kVar.g(tVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zG) {
                        zG = pVar.g(tVar2);
                    }
                }
            }
            zExpandActionView |= zG;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return p(findItem(i), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        j jVarG = g(i, keyEvent);
        boolean zP = jVarG != null ? p(jVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i, CharSequence charSequence, int i10, View view) {
        if (view != null) {
            this.f27639m = view;
            this.f27638l = null;
        } else {
            if (i > 0) {
                this.f27638l = this.f27629b.getText(i);
            } else if (charSequence != null) {
                this.f27638l = charSequence;
            }
            if (i10 > 0) {
                this.f27628a.getDrawable(i10);
            }
        }
        o(false);
    }

    public final void r() {
        this.f27640n = false;
        if (this.f27641o) {
            this.f27641o = false;
            o(this.f27642p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((j) arrayList.get(i11)).f27649b == i) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((j) arrayList.get(i11)).f27649b != i) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((j) arrayList.get(i10)).f27648a == i) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        o(true);
    }

    public final void s() {
        if (this.f27640n) {
            return;
        }
        this.f27640n = true;
        this.f27641o = false;
        this.f27642p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z5, boolean z10) {
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f27649b == i) {
                jVar.f27670x = (jVar.f27670x & (-5)) | (z10 ? 4 : 0);
                jVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f27647u = z5;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z5) {
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f27649b == i) {
                jVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z5) {
        ArrayList arrayList = this.f27633f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f27649b == i) {
                int i11 = jVar.f27670x;
                int i12 = (i11 & (-9)) | (z5 ? 0 : 8);
                jVar.f27670x = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f27630c = z5;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f27633f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f27629b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f27629b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return a(i, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        j jVarA = a(i, i10, i11, charSequence);
        t tVar = new t(this.f27628a, this, jVarA);
        jVarA.f27661o = tVar;
        tVar.setHeaderTitle(jVarA.f27652e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return a(i, i10, i11, this.f27629b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return addSubMenu(i, i10, i11, this.f27629b.getString(i12));
    }

    public i j() {
        return this;
    }
}
