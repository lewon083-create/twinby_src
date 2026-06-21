package com.google.android.gms.internal.ads;

import android.view.View;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 implements k81, n31, hl1, lo1, td0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8456c;

    public nu0(int i) {
        this.f8455b = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f8456c = new int[2];
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        switch (this.f8455b) {
            case 7:
                ((te) obj).l0((bs) this.f8456c);
                break;
            case 8:
                ((yu1) obj).l((jx1) this.f8456c);
                break;
            default:
                ((yu1) obj).e((bt1) this.f8456c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.hl1
    public Object b(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((kl1) this.f8456c).e(str, (Provider) it.next());
            } catch (Exception e3) {
                if (exc == null) {
                    exc = e3;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((lo1[]) this.f8456c)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public uo1 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            lo1 lo1Var = ((lo1[]) this.f8456c)[i];
            if (lo1Var.c(cls)) {
                return lo1Var.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.n31
    public Iterator e(xo0 xo0Var, CharSequence charSequence) {
        return new k31(charSequence, new pp0(((d31) this.f8456c).f4444d.matcher(charSequence)), 1);
    }

    public JSONObject f(View view) {
        if (view == null) {
            return su0.a(0, 0, 0, 0);
        }
        int[] iArr = (int[]) this.f8456c;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return su0.a(iArr[0], iArr[1], width, height);
    }

    public void g(Object[] objArr, Object obj) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z5 = true;
            while (it.hasNext()) {
                if (!z5) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z5 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            m41 m41Var = (m41) this.f8456c;
            if (m41Var == null) {
                m41Var = new m41();
                this.f8456c = m41Var;
            }
            s41 s41VarV = (s41) m41Var.get(obj);
            if (s41VarV == null) {
                s41VarV = d51.v(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                m41 m41Var2 = (m41) this.f8456c;
                if (m41Var2 == null) {
                    m41Var2 = new m41();
                    this.f8456c = m41Var2;
                }
                m41Var2.put(obj, s41VarV);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                fs1.j(obj, next);
                s41VarV.c(next);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        ((i21) this.f8456c).c();
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        i21 i21Var = (i21) this.f8456c;
        i21Var.b(th2);
        i21Var.c();
    }

    public /* synthetic */ nu0(int i, Object obj) {
        this.f8455b = i;
        this.f8456c = obj;
    }

    public /* synthetic */ nu0(xu1 xu1Var, bt1 bt1Var) {
        this.f8455b = 9;
        this.f8456c = bt1Var;
    }

    public /* synthetic */ nu0(xu1 xu1Var, jx1 jx1Var, ws1 ws1Var) {
        this.f8455b = 8;
        this.f8456c = jx1Var;
    }

    public nu0(j21 j21Var, i21 i21Var) {
        this.f8455b = 2;
        this.f8456c = i21Var;
        Objects.requireNonNull(j21Var);
    }
}
