package vl;

import com.google.android.gms.internal.ads.oc;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f34904e = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f34907d;

    public a(String str, String str2, b bVar) {
        k3.f.v(str);
        this.f34905b = str.trim();
        k3.f.t(str);
        this.f34906c = str2;
        this.f34907d = bVar;
    }

    public static boolean a(String str, String str2, g gVar) {
        if (gVar.f34918h == 1) {
            return str2 == null || (("".equals(str2) || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f34904e, str) >= 0);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f34905b;
            String str2 = this.f34905b;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f34906c;
            String str4 = aVar.f34906c;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34905b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34906c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f34905b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34906c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int iN;
        String str = (String) obj;
        b bVar = this.f34907d;
        String str2 = this.f34905b;
        String strF = bVar.f(str2);
        b bVar2 = this.f34907d;
        if (bVar2 != null && (iN = bVar2.n(str2)) != -1) {
            this.f34907d.f34911d[iN] = str;
        }
        this.f34906c = str;
        return strF;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            g gVar = new h().f34919j;
            String str = this.f34905b;
            String str2 = this.f34906c;
            sb2.append((CharSequence) str);
            if (!a(str, str2, gVar)) {
                sb2.append((CharSequence) "=\"");
                if (str2 == null) {
                    str2 = "";
                }
                m.b(sb2, str2, gVar, true, false);
                sb2.append('\"');
            }
            return sb2.toString();
        } catch (IOException e3) {
            throw new oc(e3);
        }
    }
}
