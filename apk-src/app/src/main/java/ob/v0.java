package ob;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.c5;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.t8;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.App;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(z3 z3Var, int i) {
        super(z3Var);
        this.f30458e = i;
    }

    public static v G(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleH = H(bVar.f13667c, true);
        String string = (!bundleH.containsKey("_o") || (obj = bundleH.get("_o")) == null) ? App.TYPE : obj.toString();
        String strG = y1.g(bVar.f13665a, y1.f30543a, y1.f30545c);
        if (strG == null) {
            strG = bVar.f13665a;
        }
        return new v(strG, new u(bundleH), string, bVar.f13666b);
    }

    public static Bundle H(Map map, boolean z5) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z5) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(H((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void I(com.google.android.gms.internal.measurement.c3 c3Var, String str, Long l10) {
        List listH = c3Var.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.g3) listH.get(i)).q())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.f3 f3VarB = com.google.android.gms.internal.measurement.g3.B();
        f3VarB.h(str);
        f3VarB.j(l10.longValue());
        if (i < 0) {
            c3Var.l(f3VarB);
        } else {
            c3Var.b();
            ((com.google.android.gms.internal.measurement.d3) c3Var.f13840c).A(i, (com.google.android.gms.internal.measurement.g3) f3VarB.e());
        }
    }

    public static final Bundle J(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) it.next();
            String strQ = g3Var.q();
            if (g3Var.x()) {
                bundle.putDouble(strQ, g3Var.y());
            } else if (g3Var.v()) {
                bundle.putFloat(strQ, g3Var.w());
            } else if (g3Var.r()) {
                bundle.putString(strQ, g3Var.s());
            } else if (g3Var.t()) {
                bundle.putLong(strQ, g3Var.u());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.g3 K(com.google.android.gms.internal.measurement.d3 d3Var, String str) {
        for (com.google.android.gms.internal.measurement.g3 g3Var : d3Var.p()) {
            if (g3Var.q().equals(str)) {
                return g3Var;
            }
        }
        return null;
    }

    public static final Serializable L(com.google.android.gms.internal.measurement.d3 d3Var, String str) {
        com.google.android.gms.internal.measurement.g3 g3VarK = K(d3Var, str);
        if (g3VarK == null) {
            return null;
        }
        return R(g3VarK);
    }

    public static final void O(int i, StringBuilder sb2) {
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("  ");
        }
    }

    public static final void P(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String Q(boolean z5, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable R(com.google.android.gms.internal.measurement.g3 g3Var) {
        if (g3Var.r()) {
            return g3Var.s();
        }
        if (g3Var.t()) {
            return Long.valueOf(g3Var.u());
        }
        if (g3Var.x()) {
            return Double.valueOf(g3Var.y());
        }
        if (g3Var.A() > 0) {
            return r0((q5) g3Var.z());
        }
        return null;
    }

    public static final void S(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(StringUtils.COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    public static final void T(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.o3 o3Var) {
        if (o3Var == null) {
            return;
        }
        O(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (o3Var.s() != 0) {
            O(4, sb2);
            sb2.append("results: ");
            int i = 0;
            for (Long l10 : o3Var.r()) {
                int i10 = i + 1;
                if (i != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i = i10;
            }
            sb2.append('\n');
        }
        if (o3Var.q() != 0) {
            O(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : o3Var.p()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (o3Var.u() != 0) {
            O(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.b3 b3Var : o3Var.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(b3Var.p() ? Integer.valueOf(b3Var.q()) : null);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(b3Var.r() ? Long.valueOf(b3Var.s()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (o3Var.w() != 0) {
            O(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.q3 q3Var : o3Var.v()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(q3Var.p() ? Integer.valueOf(q3Var.q()) : null);
                sb2.append(": [");
                Iterator it = q3Var.r().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        O(3, sb2);
        sb2.append("}\n");
    }

    public static final void U(StringBuilder sb2, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        O(i + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void V(StringBuilder sb2, int i, String str, com.google.android.gms.internal.measurement.v1 v1Var) {
        if (v1Var == null) {
            return;
        }
        O(i, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (v1Var.p()) {
            int iZ = v1Var.z();
            U(sb2, i, "comparison_type", iZ != 1 ? iZ != 2 ? iZ != 3 ? iZ != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (v1Var.q()) {
            U(sb2, i, "match_as_float", Boolean.valueOf(v1Var.r()));
        }
        if (v1Var.s()) {
            U(sb2, i, "comparison_value", v1Var.t());
        }
        if (v1Var.u()) {
            U(sb2, i, "min_comparison_value", v1Var.v());
        }
        if (v1Var.w()) {
            U(sb2, i, "max_comparison_value", v1Var.x());
        }
        O(i, sb2);
        sb2.append("}\n");
    }

    public static boolean i0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean j0(p5 p5Var, int i) {
        if (i < p5Var.size() * 64) {
            return ((1 << (i % 64)) & ((Long) p5Var.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList k0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j10 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static j5 p0(j5 j5Var, byte[] bArr) throws t5 {
        c5 c5VarJ;
        c5 c5Var = c5.f13684a;
        if (c5Var == null) {
            synchronized (c5.class) {
                try {
                    c5VarJ = c5.f13684a;
                    if (c5VarJ == null) {
                        j6 j6Var = j6.f13841c;
                        c5VarJ = h5.J();
                        c5.f13684a = c5VarJ;
                    }
                } finally {
                }
            }
            c5Var = c5VarJ;
        }
        if (c5Var != null) {
            j5Var.getClass();
            j5Var.g(bArr, bArr.length, c5Var);
            return j5Var;
        }
        j5Var.getClass();
        int length = bArr.length;
        c5 c5Var2 = c5.f13684a;
        j6 j6Var2 = j6.f13841c;
        j5Var.g(bArr, length, c5.f13685b);
        return j5Var;
    }

    public static int q0(com.google.android.gms.internal.measurement.k3 k3Var, String str) {
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).V1(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).W1(i).r())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] r0(q5 q5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = q5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) it.next();
            if (g3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.g3 g3Var2 : g3Var.z()) {
                    if (g3Var2.r()) {
                        bundle.putString(g3Var2.q(), g3Var2.s());
                    } else if (g3Var2.t()) {
                        bundle.putLong(g3Var2.q(), g3Var2.u());
                    } else if (g3Var2.x()) {
                        bundle.putDouble(g3Var2.q(), g3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap s0(Bundle bundle, boolean z5) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z5) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(s0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(s0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(s0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // ob.u3
    public final void F() {
        int i = this.f30458e;
    }

    public void M(StringBuilder sb2, int i, q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        int i10 = i + 1;
        Iterator it = q5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) it.next();
            if (g3Var != null) {
                O(i10, sb2);
                sb2.append("param {\n");
                U(sb2, i10, "name", g3Var.p() ? ((l1) this.f15951b).f30268k.b(g3Var.q()) : null);
                U(sb2, i10, "string_value", g3Var.r() ? g3Var.s() : null);
                U(sb2, i10, "int_value", g3Var.t() ? Long.valueOf(g3Var.u()) : null);
                U(sb2, i10, "double_value", g3Var.x() ? Double.valueOf(g3Var.y()) : null);
                if (g3Var.A() > 0) {
                    M(sb2, i10, (q5) g3Var.z());
                }
                O(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public void N(StringBuilder sb2, int i, com.google.android.gms.internal.measurement.s1 s1Var) {
        String str;
        if (s1Var == null) {
            return;
        }
        O(i, sb2);
        sb2.append("filter {\n");
        if (s1Var.t()) {
            U(sb2, i, "complement", Boolean.valueOf(s1Var.u()));
        }
        if (s1Var.v()) {
            U(sb2, i, "param_name", ((l1) this.f15951b).f30268k.b(s1Var.w()));
        }
        if (s1Var.p()) {
            int i10 = i + 1;
            com.google.android.gms.internal.measurement.y1 y1VarQ = s1Var.q();
            if (y1VarQ != null) {
                O(i10, sb2);
                sb2.append("string_filter {\n");
                if (y1VarQ.p()) {
                    switch (y1VarQ.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    U(sb2, i10, "match_type", str);
                }
                if (y1VarQ.q()) {
                    U(sb2, i10, "expression", y1VarQ.r());
                }
                if (y1VarQ.s()) {
                    U(sb2, i10, "case_sensitive", Boolean.valueOf(y1VarQ.t()));
                }
                if (y1VarQ.v() > 0) {
                    O(i + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : y1VarQ.u()) {
                        O(i + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                O(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (s1Var.r()) {
            V(sb2, i + 1, "number_filter", s1Var.s());
        }
        O(i, sb2);
        sb2.append("}\n");
    }

    public boolean W() {
        D();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((l1) this.f15951b).f30260b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void a0(com.google.android.gms.internal.measurement.t3 t3Var, Object obj) {
        pa.c0.i(obj);
        t3Var.b();
        ((com.google.android.gms.internal.measurement.u3) t3Var.f13840c).E();
        t3Var.b();
        ((com.google.android.gms.internal.measurement.u3) t3Var.f13840c).G();
        t3Var.b();
        ((com.google.android.gms.internal.measurement.u3) t3Var.f13840c).I();
        if (obj instanceof String) {
            t3Var.b();
            ((com.google.android.gms.internal.measurement.u3) t3Var.f13840c).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            t3Var.b();
            ((com.google.android.gms.internal.measurement.u3) t3Var.f13840c).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            t3Var.b();
            ((com.google.android.gms.internal.measurement.u3) t3Var.f13840c).H(dDoubleValue);
        } else {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void b0(String str, v3 v3Var, com.google.android.gms.internal.measurement.j3 j3Var, t0 t0Var) {
        String str2;
        String str3 = v3Var.f30464a;
        l1 l1Var = (l1) this.f15951b;
        C();
        D();
        try {
            URL url = new URI(str3).toURL();
            this.f30373c.i0();
            byte[] bArrA = j3Var.a();
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            Map map = v3Var.f30465b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                i1Var.O(new u0(this, str2, url, bArrA, map, t0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30411g.h(s0.K(str2), "Failed to parse URL. Not uploading MeasurementBatch. appId", str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void c0(com.google.android.gms.internal.measurement.f3 f3Var, Object obj) {
        f3Var.b();
        ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).E();
        f3Var.b();
        ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).G();
        f3Var.b();
        ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).I();
        f3Var.b();
        ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).L();
        if (obj instanceof String) {
            f3Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            f3Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            f3Var.b();
            ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.f3 f3VarB = com.google.android.gms.internal.measurement.g3.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.f3 f3VarB2 = com.google.android.gms.internal.measurement.g3.B();
                    f3VarB2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        f3VarB2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        f3VarB2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        f3VarB2.b();
                        ((com.google.android.gms.internal.measurement.g3) f3VarB2.f13840c).H(dDoubleValue2);
                    }
                    f3VarB.b();
                    ((com.google.android.gms.internal.measurement.g3) f3VarB.f13840c).J((com.google.android.gms.internal.measurement.g3) f3VarB2.e());
                }
                if (((com.google.android.gms.internal.measurement.g3) f3VarB.f13840c).A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.g3) f3VarB.e());
                }
            }
        }
        f3Var.b();
        ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).K(arrayList);
    }

    public o3 d0(String str, com.google.android.gms.internal.measurement.k3 k3Var, com.google.android.gms.internal.measurement.c3 c3Var, String str2) {
        int iIndexOf;
        t8.a();
        l1 l1Var = (l1) this.f15951b;
        g gVar = l1Var.f30263e;
        if (!gVar.M(str, d0.P0)) {
            return null;
        }
        l1Var.f30269l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = gVar.I(str, d0.f30045u0).split(StringUtils.COMMA);
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        z3 z3Var = this.f30373c;
        w3 w3Var = z3Var.f30613k;
        e1 e1Var = z3Var.f30605b;
        e1 e1Var2 = w3Var.f30373c.f30605b;
        z3.T(e1Var2);
        String strP = e1Var2.P(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((l1) w3Var.f15951b).f30263e;
        builder.scheme(gVar2.I(str, d0.f30032n0));
        if (TextUtils.isEmpty(strP)) {
            builder.authority(gVar2.I(str, d0.o0));
        } else {
            String strI = gVar2.I(str, d0.o0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strP).length() + 1 + String.valueOf(strI).length());
            sb2.append(strP);
            sb2.append(".");
            sb2.append(strI);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.I(str, d0.f30035p0));
        P(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).E(), setUnmodifiableSet);
        gVar.H();
        P(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strY = ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).y();
        c0 c0Var = d0.S0;
        if (gVar.M(str, c0Var)) {
            z3.T(e1Var);
            if (e1Var.V(str)) {
                strY = "";
            }
        }
        P(builder, "app_instance_id", strY, setUnmodifiableSet);
        P(builder, "rdid", ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).v(), setUnmodifiableSet);
        P(builder, "bundle_id", k3Var.o(), setUnmodifiableSet);
        String strN = c3Var.n();
        String strG = y1.g(strN, y1.f30545c, y1.f30543a);
        if (true != TextUtils.isEmpty(strG)) {
            strN = strG;
        }
        P(builder, "app_event_name", strN, setUnmodifiableSet);
        P(builder, App.JsonKeys.APP_VERSION, String.valueOf(((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).K()), setUnmodifiableSet);
        String strI2 = ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).i2();
        if (gVar.M(str, c0Var)) {
            z3.T(e1Var);
            if (e1Var.U(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        P(builder, CommonUrlParts.OS_VERSION, strI2, setUnmodifiableSet);
        P(builder, "timestamp", String.valueOf(c3Var.o()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).x()) {
            P(builder, "lat", "1", setUnmodifiableSet);
        }
        P(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).G0()), setUnmodifiableSet);
        P(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        P(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        P(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.g3> listH = c3Var.h();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.g3 g3Var : listH) {
            String strQ = g3Var.q();
            if (g3Var.x()) {
                bundle.putString(strQ, String.valueOf(g3Var.y()));
            } else if (g3Var.v()) {
                bundle.putString(strQ, String.valueOf(g3Var.w()));
            } else if (g3Var.r()) {
                bundle.putString(strQ, g3Var.s());
            } else if (g3Var.t()) {
                bundle.putString(strQ, String.valueOf(g3Var.u()));
            }
        }
        S(builder, gVar.I(str, d0.f30043t0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.u3> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.u3 u3Var : listUnmodifiableList) {
            String strR = u3Var.r();
            if (u3Var.y()) {
                bundle2.putString(strR, String.valueOf(u3Var.z()));
            } else if (u3Var.w()) {
                bundle2.putString(strR, String.valueOf(u3Var.x()));
            } else if (u3Var.s()) {
                bundle2.putString(strR, u3Var.t());
            } else if (u3Var.u()) {
                bundle2.putString(strR, String.valueOf(u3Var.v()));
            }
        }
        S(builder, gVar.I(str, d0.f30041s0).split("\\|"), bundle2, setUnmodifiableSet);
        P(builder, "dma", true != ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).D0() ? CommonUrlParts.Values.FALSE_INTEGER : "1", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).F0().isEmpty()) {
            P(builder, "dma_cps", ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).F0(), setUnmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).L0()) {
            com.google.android.gms.internal.measurement.q2 q2VarM0 = ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).M0();
            if (!q2VarM0.z().isEmpty()) {
                P(builder, "dl_gclid", q2VarM0.z(), setUnmodifiableSet);
            }
            if (!q2VarM0.B().isEmpty()) {
                P(builder, "dl_gbraid", q2VarM0.B(), setUnmodifiableSet);
            }
            if (!q2VarM0.D().isEmpty()) {
                P(builder, "dl_gs", q2VarM0.D(), setUnmodifiableSet);
            }
            if (q2VarM0.F() > 0) {
                P(builder, "dl_ss_ts", String.valueOf(q2VarM0.F()), setUnmodifiableSet);
            }
            if (!q2VarM0.H().isEmpty()) {
                P(builder, "mr_gclid", q2VarM0.H(), setUnmodifiableSet);
            }
            if (!q2VarM0.J().isEmpty()) {
                P(builder, "mr_gbraid", q2VarM0.J(), setUnmodifiableSet);
            }
            if (!q2VarM0.L().isEmpty()) {
                P(builder, "mr_gs", q2VarM0.L(), setUnmodifiableSet);
            }
            if (q2VarM0.N() > 0) {
                P(builder, "mr_click_ts", String.valueOf(q2VarM0.N()), setUnmodifiableSet);
            }
        }
        return new o3(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public com.google.android.gms.internal.measurement.d3 e0(r rVar) {
        com.google.android.gms.internal.measurement.c3 c3VarZ = com.google.android.gms.internal.measurement.d3.z();
        long j10 = rVar.f30376c;
        c3VarZ.b();
        ((com.google.android.gms.internal.measurement.d3) c3VarZ.f13840c).H(j10);
        u uVar = (u) rVar.f30380g;
        Objects.requireNonNull(uVar);
        Bundle bundle = uVar.f30430b;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.f3 f3VarB = com.google.android.gms.internal.measurement.g3.B();
            f3VarB.h(str);
            Object obj = bundle.get(str);
            pa.c0.i(obj);
            c0(f3VarB, obj);
            c3VarZ.l(f3VarB);
        }
        String str2 = (String) rVar.f30379f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.f3 f3VarB2 = com.google.android.gms.internal.measurement.g3.B();
            f3VarB2.h("_o");
            f3VarB2.i(str2);
            c3VarZ.k((com.google.android.gms.internal.measurement.g3) f3VarB2.e());
        }
        return (com.google.android.gms.internal.measurement.d3) c3VarZ.e();
    }

    public String f0(com.google.android.gms.internal.measurement.j3 j3Var) {
        com.google.android.gms.internal.measurement.t2 t2VarI0;
        StringBuilder sbJ = pe.a.j("\nbatch {\n");
        if (j3Var.u()) {
            U(sbJ, 0, "upload_subdomain", j3Var.v());
        }
        if (j3Var.s()) {
            U(sbJ, 0, "sgtm_join_id", j3Var.t());
        }
        for (com.google.android.gms.internal.measurement.l3 l3Var : j3Var.p()) {
            if (l3Var != null) {
                O(1, sbJ);
                sbJ.append("bundle {\n");
                if (l3Var.P()) {
                    U(sbJ, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(l3Var.P0()));
                }
                l1 l1Var = (l1) this.f15951b;
                g gVar = l1Var.f30263e;
                o0 o0Var = l1Var.f30268k;
                if (gVar.M(l3Var.p(), d0.M0) && l3Var.v0()) {
                    U(sbJ, 1, "session_stitching_token", l3Var.w0());
                }
                U(sbJ, 1, "platform", l3Var.h2());
                if (l3Var.r()) {
                    U(sbJ, 1, "gmp_version", Long.valueOf(l3Var.s()));
                }
                if (l3Var.t()) {
                    U(sbJ, 1, "uploading_gmp_version", Long.valueOf(l3Var.u()));
                }
                if (l3Var.r0()) {
                    U(sbJ, 1, "dynamite_version", Long.valueOf(l3Var.s0()));
                }
                if (l3Var.L()) {
                    U(sbJ, 1, "config_version", Long.valueOf(l3Var.M()));
                }
                U(sbJ, 1, "gmp_app_id", l3Var.E());
                U(sbJ, 1, CommonUrlParts.APP_ID, l3Var.p());
                U(sbJ, 1, App.JsonKeys.APP_VERSION, l3Var.q());
                if (l3Var.J()) {
                    U(sbJ, 1, "app_version_major", Integer.valueOf(l3Var.K()));
                }
                U(sbJ, 1, "firebase_instance_id", l3Var.I());
                if (l3Var.z()) {
                    U(sbJ, 1, "dev_cert_hash", Long.valueOf(l3Var.A()));
                }
                U(sbJ, 1, "app_store", l3Var.n2());
                if (l3Var.X1()) {
                    U(sbJ, 1, "upload_timestamp_millis", Long.valueOf(l3Var.Y1()));
                }
                if (l3Var.Z1()) {
                    U(sbJ, 1, "start_timestamp_millis", Long.valueOf(l3Var.a2()));
                }
                if (l3Var.b2()) {
                    U(sbJ, 1, "end_timestamp_millis", Long.valueOf(l3Var.c2()));
                }
                if (l3Var.d2()) {
                    U(sbJ, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(l3Var.e2()));
                }
                if (l3Var.f2()) {
                    U(sbJ, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(l3Var.g2()));
                }
                U(sbJ, 1, "app_instance_id", l3Var.y());
                U(sbJ, 1, "resettable_device_id", l3Var.v());
                U(sbJ, 1, "ds_id", l3Var.O());
                if (l3Var.w()) {
                    U(sbJ, 1, "limited_ad_tracking", Boolean.valueOf(l3Var.x()));
                }
                U(sbJ, 1, CommonUrlParts.OS_VERSION, l3Var.i2());
                U(sbJ, 1, ProfilingTraceData.JsonKeys.DEVICE_MODEL, l3Var.j2());
                U(sbJ, 1, "user_default_language", l3Var.k2());
                if (l3Var.l2()) {
                    U(sbJ, 1, "time_zone_offset_minutes", Integer.valueOf(l3Var.m2()));
                }
                if (l3Var.B()) {
                    U(sbJ, 1, "bundle_sequential_index", Integer.valueOf(l3Var.C()));
                }
                if (l3Var.J0()) {
                    U(sbJ, 1, "delivery_index", Integer.valueOf(l3Var.K0()));
                }
                if (l3Var.F()) {
                    U(sbJ, 1, "service_upload", Boolean.valueOf(l3Var.G()));
                }
                U(sbJ, 1, "health_monitor", l3Var.D());
                if (l3Var.p0()) {
                    U(sbJ, 1, "retry_counter", Integer.valueOf(l3Var.q0()));
                }
                if (l3Var.t0()) {
                    U(sbJ, 1, "consent_signals", l3Var.u0());
                }
                if (l3Var.C0()) {
                    U(sbJ, 1, "is_dma_region", Boolean.valueOf(l3Var.D0()));
                }
                if (l3Var.E0()) {
                    U(sbJ, 1, "core_platform_services", l3Var.F0());
                }
                if (l3Var.A0()) {
                    U(sbJ, 1, "consent_diagnostics", l3Var.B0());
                }
                if (l3Var.x0()) {
                    U(sbJ, 1, "target_os_version", Long.valueOf(l3Var.y0()));
                }
                t8.a();
                if (l1Var.f30263e.M(l3Var.p(), d0.P0)) {
                    U(sbJ, 1, "ad_services_version", Integer.valueOf(l3Var.G0()));
                    if (l3Var.H0() && (t2VarI0 = l3Var.I0()) != null) {
                        O(2, sbJ);
                        sbJ.append("attribution_eligibility_status {\n");
                        U(sbJ, 2, "eligible", Boolean.valueOf(t2VarI0.p()));
                        U(sbJ, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(t2VarI0.q()));
                        U(sbJ, 2, "pre_r", Boolean.valueOf(t2VarI0.r()));
                        U(sbJ, 2, "r_extensions_too_old", Boolean.valueOf(t2VarI0.s()));
                        U(sbJ, 2, "adservices_extension_too_old", Boolean.valueOf(t2VarI0.t()));
                        U(sbJ, 2, "ad_storage_not_allowed", Boolean.valueOf(t2VarI0.u()));
                        U(sbJ, 2, "measurement_manager_disabled", Boolean.valueOf(t2VarI0.v()));
                        O(2, sbJ);
                        sbJ.append("}\n");
                    }
                }
                if (l3Var.L0()) {
                    com.google.android.gms.internal.measurement.q2 q2VarM0 = l3Var.M0();
                    O(2, sbJ);
                    sbJ.append("ad_campaign_info {\n");
                    if (q2VarM0.y()) {
                        U(sbJ, 2, "deep_link_gclid", q2VarM0.z());
                    }
                    if (q2VarM0.A()) {
                        U(sbJ, 2, "deep_link_gbraid", q2VarM0.B());
                    }
                    if (q2VarM0.C()) {
                        U(sbJ, 2, "deep_link_gad_source", q2VarM0.D());
                    }
                    if (q2VarM0.E()) {
                        U(sbJ, 2, "deep_link_session_millis", Long.valueOf(q2VarM0.F()));
                    }
                    if (q2VarM0.G()) {
                        U(sbJ, 2, "market_referrer_gclid", q2VarM0.H());
                    }
                    if (q2VarM0.I()) {
                        U(sbJ, 2, "market_referrer_gbraid", q2VarM0.J());
                    }
                    if (q2VarM0.K()) {
                        U(sbJ, 2, "market_referrer_gad_source", q2VarM0.L());
                    }
                    if (q2VarM0.M()) {
                        U(sbJ, 2, "market_referrer_click_millis", Long.valueOf(q2VarM0.N()));
                    }
                    O(2, sbJ);
                    sbJ.append("}\n");
                }
                if (l3Var.Q()) {
                    U(sbJ, 1, "batching_timestamp_millis", Long.valueOf(l3Var.R()));
                }
                if (l3Var.N0()) {
                    com.google.android.gms.internal.measurement.s3 s3VarO0 = l3Var.O0();
                    O(2, sbJ);
                    sbJ.append("sgtm_diagnostics {\n");
                    int iT = s3VarO0.t();
                    U(sbJ, 2, "upload_type", iT != 1 ? iT != 2 ? iT != 3 ? iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    U(sbJ, 2, "client_upload_eligibility", om1.D(s3VarO0.p()));
                    int iU = s3VarO0.u();
                    U(sbJ, 2, "service_upload_eligibility", iU != 1 ? iU != 2 ? iU != 3 ? iU != 4 ? iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    O(2, sbJ);
                    sbJ.append("}\n");
                }
                if (l3Var.S()) {
                    com.google.android.gms.internal.measurement.z2 z2VarT = l3Var.T();
                    O(2, sbJ);
                    sbJ.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.y2 y2Var : z2VarT.p()) {
                        O(3, sbJ);
                        sbJ.append("limited_data_modes {\n");
                        int iQ = y2Var.q();
                        U(sbJ, 3, "type", iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iR = y2Var.r();
                        U(sbJ, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        O(3, sbJ);
                        sbJ.append("}\n");
                    }
                    O(2, sbJ);
                    sbJ.append("}\n");
                }
                q5<com.google.android.gms.internal.measurement.u3> q5VarU1 = l3Var.U1();
                if (q5VarU1 != null) {
                    for (com.google.android.gms.internal.measurement.u3 u3Var : q5VarU1) {
                        if (u3Var != null) {
                            O(2, sbJ);
                            sbJ.append("user_property {\n");
                            U(sbJ, 2, "set_timestamp_millis", u3Var.p() ? Long.valueOf(u3Var.q()) : null);
                            U(sbJ, 2, "name", o0Var.c(u3Var.r()));
                            U(sbJ, 2, "string_value", u3Var.t());
                            U(sbJ, 2, "int_value", u3Var.u() ? Long.valueOf(u3Var.v()) : null);
                            U(sbJ, 2, "double_value", u3Var.y() ? Double.valueOf(u3Var.z()) : null);
                            O(2, sbJ);
                            sbJ.append("}\n");
                        }
                    }
                }
                q5<com.google.android.gms.internal.measurement.v2> q5VarH = l3Var.H();
                if (q5VarH != null) {
                    for (com.google.android.gms.internal.measurement.v2 v2Var : q5VarH) {
                        if (v2Var != null) {
                            O(2, sbJ);
                            sbJ.append("audience_membership {\n");
                            if (v2Var.p()) {
                                U(sbJ, 2, "audience_id", Integer.valueOf(v2Var.q()));
                            }
                            if (v2Var.u()) {
                                U(sbJ, 2, "new_audience", Boolean.valueOf(v2Var.v()));
                            }
                            T(sbJ, "current_data", v2Var.r());
                            if (v2Var.s()) {
                                T(sbJ, "previous_data", v2Var.t());
                            }
                            O(2, sbJ);
                            sbJ.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.d3> listP1 = l3Var.P1();
                if (listP1 != null) {
                    for (com.google.android.gms.internal.measurement.d3 d3Var : listP1) {
                        if (d3Var != null) {
                            O(2, sbJ);
                            sbJ.append("event {\n");
                            U(sbJ, 2, "name", o0Var.a(d3Var.s()));
                            if (d3Var.t()) {
                                U(sbJ, 2, "timestamp_millis", Long.valueOf(d3Var.u()));
                            }
                            if (d3Var.v()) {
                                U(sbJ, 2, "previous_timestamp_millis", Long.valueOf(d3Var.w()));
                            }
                            if (d3Var.x()) {
                                U(sbJ, 2, "count", Integer.valueOf(d3Var.y()));
                            }
                            if (d3Var.q() != 0) {
                                M(sbJ, 2, (q5) d3Var.p());
                            }
                            O(2, sbJ);
                            sbJ.append("}\n");
                        }
                    }
                }
                O(1, sbJ);
                sbJ.append("}\n");
            }
        }
        sbJ.append("} // End-of-batch\n");
        return sbJ.toString();
    }

    public String g0(com.google.android.gms.internal.measurement.x1 x1Var) {
        StringBuilder sbJ = pe.a.j("\nproperty_filter {\n");
        if (x1Var.p()) {
            U(sbJ, 0, "filter_id", Integer.valueOf(x1Var.q()));
        }
        U(sbJ, 0, "property_name", ((l1) this.f15951b).f30268k.c(x1Var.r()));
        String strQ = Q(x1Var.t(), x1Var.u(), x1Var.w());
        if (!strQ.isEmpty()) {
            U(sbJ, 0, "filter_type", strQ);
        }
        N(sbJ, 1, x1Var.s());
        sbJ.append("}\n");
        return sbJ.toString();
    }

    public Parcelable h0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (qa.b unused) {
                s0 s0Var = ((l1) this.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30411g.f("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public List l0(p5 p5Var, List list) {
        int i;
        l1 l1Var = (l1) this.f15951b;
        ArrayList arrayList = new ArrayList(p5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30413j.g(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30413j.h(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean m0(long j10, long j11) {
        if (j10 == 0 || j11 <= 0) {
            return true;
        }
        ((l1) this.f15951b).f30269l.getClass();
        return Math.abs(System.currentTimeMillis() - j10) > j11;
    }

    public long n0(byte[] bArr) {
        pa.c0.i(bArr);
        l1 l1Var = (l1) this.f15951b;
        e4 e4Var = l1Var.f30267j;
        l1.h(e4Var);
        e4Var.C();
        MessageDigest messageDigestT = e4.T();
        if (messageDigestT != null) {
            return e4.U(messageDigestT.digest(bArr));
        }
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30411g.f("Failed to get MD5");
        return 0L;
    }

    public byte[] o0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(e3, "Failed to gzip content");
            throw e3;
        }
    }

    private final void X() {
    }

    private final void Y() {
    }

    private final void Z() {
    }
}
