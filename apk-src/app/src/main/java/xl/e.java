package xl;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36269b;

    public /* synthetic */ e(int i) {
        this.f36268a = i;
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        String str;
        String str2;
        switch (this.f36268a) {
            case 0:
                return kVar2.k(this.f36269b);
            case 1:
                vl.b bVarD = kVar2.d();
                bVarD.getClass();
                ArrayList arrayList = new ArrayList(bVarD.f34909b);
                for (int i = 0; i < bVarD.f34909b; i++) {
                    String str3 = bVarD.f34911d[i];
                    arrayList.add(str3 == null ? new vl.c(bVarD.f34910c[i], null, null) : new vl.a(bVarD.f34910c[i], str3, bVarD));
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (d4.p(((vl.a) it.next()).f34905b).startsWith(this.f36269b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                String str4 = this.f36269b;
                vl.b bVarD2 = kVar2.d();
                int iO = bVarD2.o("class");
                if (iO == -1 || (str = bVarD2.f34911d[iO]) == null) {
                    str = "";
                }
                String str5 = str;
                int length = str5.length();
                int length2 = str4.length();
                if (length == 0 || length < length2) {
                    return false;
                }
                if (length == length2) {
                    return str4.equalsIgnoreCase(str5);
                }
                boolean z5 = false;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (Character.isWhitespace(str5.charAt(i11))) {
                        if (!z5) {
                            continue;
                        } else {
                            if (i11 - i10 == length2 && str5.regionMatches(true, i10, str4, 0, length2)) {
                                return true;
                            }
                            z5 = false;
                        }
                    } else if (!z5) {
                        i10 = i11;
                        z5 = true;
                    }
                }
                if (z5 && length - i10 == length2) {
                    return str5.regionMatches(true, i10, str4, 0, length2);
                }
                return false;
            case 3:
                return d4.p(kVar2.x()).contains(this.f36269b);
            case 4:
                return d4.p(kVar2.z()).contains(this.f36269b);
            case 5:
                kVar2.getClass();
                StringBuilder sb2 = new StringBuilder();
                rl.b.v(new m7.a(24, sb2), kVar2);
                return d4.p(sb2.toString().trim()).contains(this.f36269b);
            case 6:
                String str6 = this.f36269b;
                vl.b bVarD3 = kVar2.d();
                int iO2 = bVarD3.o("id");
                if (iO2 == -1 || (str2 = bVarD3.f34911d[iO2]) == null) {
                    str2 = "";
                }
                return str6.equals(str2);
            case 7:
                return kVar2.f34922d.f35436a.equalsIgnoreCase(this.f36269b);
            default:
                return kVar2.f34922d.f35436a.endsWith(this.f36269b);
        }
    }

    public final String toString() {
        switch (this.f36268a) {
            case 0:
                return pe.a.f("[", this.f36269b, "]");
            case 1:
                return pe.a.f("[^", this.f36269b, "]");
            case 2:
                return om1.k(".", this.f36269b);
            case 3:
                return pe.a.f(":containsData(", this.f36269b, ")");
            case 4:
                return pe.a.f(":containsOwn(", this.f36269b, ")");
            case 5:
                return pe.a.f(":contains(", this.f36269b, ")");
            case 6:
                return om1.k("#", this.f36269b);
            case 7:
                return this.f36269b;
            default:
                return this.f36269b;
        }
    }

    public e(String str) {
        this.f36268a = 7;
        this.f36269b = str;
    }
}
