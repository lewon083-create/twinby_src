package wa;

import a0.a2;
import a0.b2;
import a6.j;
import a8.f;
import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Display;
import c7.i;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.y3;
import g0.q1;
import g0.u1;
import g0.v1;
import g0.x1;
import h6.c;
import ij.p;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import ob.a0;
import p2.e0;
import p2.i0;
import t2.h;
import t9.h0;
import u2.l;
import u2.m;
import uk.o0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f35214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f35215c;

    public static n A(Object obj) {
        if (obj == null) {
            return n.C1;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new g((Double) obj);
        }
        if (obj instanceof Long) {
            return new g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            d dVar = new d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.u(dVar.r(), A(it.next()));
            }
            return dVar;
        }
        k kVar = new k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            n nVarA = A(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                kVar.a((String) string, nVarA);
            }
        }
        return kVar;
    }

    public static n B(y3 y3Var) {
        if (y3Var == null) {
            return n.B1;
        }
        int iX = y3Var.x() - 1;
        if (iX == 1) {
            return y3Var.r() ? new q(y3Var.s()) : n.I1;
        }
        if (iX == 2) {
            return y3Var.v() ? new g(Double.valueOf(y3Var.w())) : new g(null);
        }
        if (iX == 3) {
            return y3Var.t() ? new e(Boolean.valueOf(y3Var.u())) : new e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = y3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(B((y3) it.next()));
        }
        return new o(y3Var.q(), arrayList);
    }

    public static x1 b(Context context, Bundle bundle) {
        boolean z5 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrT = t(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrT2 = t(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        com.google.android.gms.internal.auth.g.e("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        com.google.android.gms.internal.auth.g.e("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z5);
        com.google.android.gms.internal.auth.g.e("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrT));
        com.google.android.gms.internal.auth.g.e("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrT2));
        return new x1(z5, new HashSet(w(strArrT)), new HashSet(w(strArrT2)));
    }

    public static byte f(long j10) {
        h5.f("out of range: %s", j10, (j10 >> 8) == 0);
        return (byte) j10;
    }

    public static c h(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicO = j.o(it.next());
            arrayList.add(new h6.d(topicO.getTopicId(), topicO.getTaxonomyVersion(), topicO.getModelVersion()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicC = b4.a.c(it2.next());
            byte[] encryptedTopic = encryptedTopicC.getEncryptedTopic();
            Intrinsics.checkNotNullExpressionValue(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicC.getKeyIdentifier();
            Intrinsics.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicC.getEncapsulatedKey();
            Intrinsics.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new h6.a(keyIdentifier, encryptedTopic, encapsulatedKey));
        }
        return new c(arrayList, arrayList2);
    }

    public static t2.d i(m4.d dVar, List migrations, mk.c scope, f7.j produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        i0 storage = new i0(h.f33405a, new i(3, produceFile));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        p2.c a0Var = dVar;
        if (dVar == null) {
            a0Var = new a0(24);
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new t2.d(new t2.d(new e0(storage, r.c(new cx0(migrations, (mj.a) null, 9)), a0Var, scope)));
    }

    public static m j(Context context) {
        ProviderInfo providerInfo;
        d2.d dVar;
        ApplicationInfo applicationInfo;
        h0 bVar = Build.VERSION.SDK_INT >= 28 ? new u2.b() : new h0();
        PackageManager packageManager = context.getPackageManager();
        f2.g.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrF = bVar.f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrF) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new d2.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new m(new l(context, dVar));
    }

    public static yi.b k(String str) {
        return new yi.b("channel-error", pe.a.f("Unable to establish connection on channel: ", str, "."), "");
    }

    public static a8.a l(b8.a aVar) {
        long j10 = 0;
        String strH = "";
        String strH2 = "";
        while (true) {
            int i = aVar.i();
            if (i == 0) {
                return new a8.a(strH, strH2, j10);
            }
            int i10 = i >>> 3;
            int i11 = i & 7;
            switch (i10) {
                case 1:
                    b8.a.d(i10, 0, i11);
                    aVar.j();
                    break;
                case 2:
                    b8.a.d(i10, 0, i11);
                    j10 = aVar.j();
                    break;
                case 3:
                    b8.a.d(i10, 0, i11);
                    aVar.j();
                    break;
                case 4:
                    b8.a.d(i10, 2, i11);
                    strH = aVar.h();
                    break;
                case 5:
                    b8.a.d(i10, 0, i11);
                    aVar.j();
                    break;
                case 6:
                    b8.a.d(i10, 2, i11);
                    strH2 = aVar.h();
                    break;
                case 7:
                    b8.a.d(i10, 0, i11);
                    aVar.j();
                    break;
                case 8:
                    b8.a.d(i10, 2, i11);
                    aVar.h();
                    break;
                default:
                    aVar.k(i11);
                    break;
            }
        }
    }

    public static nc.e m(b8.a aVar) {
        while (true) {
            int i = aVar.i();
            if (i == 0) {
                return new nc.e();
            }
            int i10 = i >>> 3;
            int i11 = i & 7;
            if (i10 == 1) {
                b8.a.d(i10, 2, i11);
                aVar.h();
            } else if (i10 == 2) {
                b8.a.d(i10, 2, i11);
                aVar.h();
            } else if (i10 == 3) {
                b8.a.d(i10, 0, i11);
                aVar.j();
            } else if (i10 == 4) {
                b8.a.d(i10, 2, i11);
                aVar.f();
            } else if (i10 != 6) {
                aVar.k(i11);
            } else {
                b8.a.d(i10, 2, i11);
                b8.a aVarG = aVar.g();
                while (true) {
                    int i12 = aVarG.i();
                    if (i12 != 0) {
                        int i13 = i12 >>> 3;
                        int i14 = i12 & 7;
                        if (i13 != 1) {
                            aVarG.k(i14);
                        } else {
                            b8.a.d(i13, 2, i14);
                            aVarG.f();
                        }
                    }
                }
            }
        }
    }

    public static void n(b8.a aVar, HashMap map) {
        int i;
        int i10;
        b8.a aVar2;
        int i11 = 0;
        f fVar = null;
        int iJ = 0;
        while (true) {
            int i12 = aVar.i();
            if (i12 == 0) {
                if (fVar != null) {
                    map.put(Integer.valueOf(iJ), fVar);
                    return;
                }
                return;
            }
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            int i15 = 1;
            if (i13 == 1) {
                i = i11;
                b8.a.d(i13, i, i14);
                iJ = (int) aVar.j();
            } else if (i13 != 2) {
                aVar.k(i14);
                i = i11;
            } else {
                b8.a.d(i13, 2, i14);
                b8.a aVarG = aVar.g();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int iJ2 = i11;
                String strH = "";
                while (true) {
                    int i16 = aVarG.i();
                    if (i16 != 0) {
                        int i17 = i16 >>> 3;
                        int i18 = i16 & 7;
                        switch (i17) {
                            case 1:
                                i10 = i11;
                                aVar2 = aVarG;
                                b8.a.d(i17, i10, i18);
                                iJ2 = (int) aVar2.j();
                                break;
                            case 2:
                                aVar2 = aVarG;
                                b8.a.d(i17, 2, i18);
                                strH = aVar2.h();
                                i10 = 0;
                                break;
                            case 3:
                                b8.a.d(i17, 2, i18);
                                b8.a aVarG2 = aVarG.g();
                                String strH2 = "";
                                long j10 = 0;
                                while (true) {
                                    int i19 = aVarG2.i();
                                    if (i19 == 0) {
                                        aVar2 = aVarG;
                                        arrayList.add(new a8.c(strH2, j10));
                                        i10 = 0;
                                    } else {
                                        int i20 = i19 >>> 3;
                                        b8.a aVar3 = aVarG;
                                        int i21 = i19 & 7;
                                        if (i20 == i15) {
                                            b8.a.d(i20, 2, i21);
                                            strH2 = aVarG2.h();
                                        } else if (i20 != 2) {
                                            aVarG2.k(i21);
                                        } else {
                                            b8.a.d(i20, 0, i21);
                                            j10 = aVarG2.j();
                                        }
                                        aVarG = aVar3;
                                        i15 = 1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                b8.a.d(i17, 2, i18);
                                arrayList4.add(l(aVarG.g()));
                                aVar2 = aVarG;
                                i10 = 0;
                                break;
                            case 5:
                                b8.a.d(i17, 2, i18);
                                arrayList5.add(m(aVarG.g()));
                                aVar2 = aVarG;
                                i10 = 0;
                                break;
                            case 6:
                                b8.a.d(i17, i11, i18);
                                aVarG.j();
                                i10 = i11;
                                aVar2 = aVarG;
                                break;
                            case 7:
                                b8.a.d(i17, 2, i18);
                                arrayList2.add(aVarG.h());
                                aVar2 = aVarG;
                                i10 = 0;
                                break;
                            case 8:
                                b8.a.d(i17, i11, i18);
                                aVarG.j();
                                i10 = i11;
                                aVar2 = aVarG;
                                break;
                            case 9:
                                b8.a.d(i17, 2, i18);
                                arrayList3.add(aVarG.h());
                                aVar2 = aVarG;
                                i10 = 0;
                                break;
                            default:
                                aVarG.k(i18);
                                aVar2 = aVarG;
                                i10 = 0;
                                break;
                        }
                        i11 = i10;
                        aVarG = aVar2;
                        i15 = 1;
                    } else {
                        i = i11;
                        fVar = new f(iJ2, strH, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                    }
                }
            }
            i11 = i;
        }
    }

    public static boolean o(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String p(androidx.datastore.preferences.protobuf.h hVar) {
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i = 0; i < hVar.size(); i++) {
            byte bA = hVar.a(i);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final qk.a q(qk.c cVar, tk.a decoder, String str) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        cVar.getClass();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        decoder.b().getClass();
        Intrinsics.checkNotNullParameter(null, "baseClass");
        k0.c(1, null);
        o0.f(str, null);
        throw null;
    }

    public static zk.j r(SSLSession sSLSession) throws IOException {
        Object objJ;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        zk.f fVarC = zk.f.f46360b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        zk.h0 h0VarR = b4.r(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            objJ = peerCertificates != null ? al.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : b0.f27475b;
        } catch (SSLPeerUnverifiedException unused) {
            objJ = b0.f27475b;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new zk.j(h0VarR, fVarC, localCertificates != null ? al.b.j(Arrays.copyOf(localCertificates, localCertificates.length)) : b0.f27475b, new i(4, objJ));
    }

    public static synchronized boolean s(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f35214b;
        if (context2 != null && (bool = f35215c) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f35215c = null;
        if (ua.b.h()) {
            f35215c = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f35215c = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f35215c = Boolean.FALSE;
            }
        }
        f35214b = applicationContext;
        return f35215c.booleanValue();
    }

    public static String[] t(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            com.google.android.gms.internal.auth.g.O("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e3) {
            com.google.android.gms.internal.auth.g.P("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e3);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashSet w(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<g0.w1> r6 = g0.w1.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            com.google.android.gms.internal.auth.g.O(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.google.android.gms.internal.auth.g.P(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.a.w(java.lang.String[]):java.util.HashSet");
    }

    public static void x(ii.f binaryMessenger, final fj.c cVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        p pVar = fj.e.f19337b;
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (ii.m) pVar.getValue(), obj);
        if (cVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.d
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l10 = (Long) obj3;
                            long jLongValue = l10.longValue();
                            try {
                                cVar2.g();
                                Object objF = cVar2.f(jLongValue);
                                if (objF instanceof d1) {
                                    ((d1) objF).destroy();
                                }
                                cVar2.f19314d.remove(l10);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        default:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                cVar3.f19312b.clear();
                                cVar3.f19313c.clear();
                                cVar3.f19314d.clear();
                                cVar3.f19316f.clear();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (ii.m) pVar.getValue(), obj);
        if (cVar == null) {
            gVar2.L(null);
        } else {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.d
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i10) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l10 = (Long) obj3;
                            long jLongValue = l10.longValue();
                            try {
                                cVar2.g();
                                Object objF = cVar2.f(jLongValue);
                                if (objF instanceof d1) {
                                    ((d1) objF).destroy();
                                }
                                cVar2.f19314d.remove(l10);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        default:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                cVar3.f19312b.clear();
                                cVar3.f19313c.clear();
                                cVar3.f19314d.clear();
                                cVar3.f19316f.clear();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                    }
                }
            });
        }
    }

    public static void y(ii.f binaryMessenger, final l6.i iVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = iVar != null ? ((ji0) iVar.f27978c).a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Preview.pigeon_defaultConstructor", mVarA, obj);
        if (iVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.y0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List listF4;
                    b2 b2Var;
                    List listF5;
                    List listF6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    switch (i) {
                        case 0:
                            l6.i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                fj.c cVar = (fj.c) ((ji0) iVar2.f27978c).f6853d;
                                q1 q1Var = new a0.t0(2).f224b;
                                if (l10 != null) {
                                    int iIntValue = l10.intValue();
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(iIntValue));
                                    q1Var.y(g0.i1.f19606k, Integer.valueOf(iIntValue));
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                v1 v1Var = new v1(u1.u(q1Var));
                                g0.i1.r(v1Var);
                                a2 a2Var = new a2(v1Var);
                                a2Var.f17r = a2.f15y;
                                cVar.a(jLongValue, a2Var);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 1:
                            l6.i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var2 = (a2) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj5;
                            try {
                                io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) ((ji0) iVar3.f27978c).f6856g;
                                jVar.getClass();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
                                a2Var2.I(new com.google.firebase.messaging.o(iVar3, textureRegistry$SurfaceProducerD, m1Var, 13));
                                ((HashMap) iVar3.f27979d).put(a2Var2, textureRegistry$SurfaceProducerD);
                                listF2 = kotlin.collections.r.c(Long.valueOf(textureRegistry$SurfaceProducerD.id()));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 2:
                            l6.i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) iVar4.f27979d).remove((a2) obj6);
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            listF3 = kotlin.collections.r.c(null);
                            reply.i(listF3);
                            return;
                        case 3:
                            l6.i iVar5 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var3 = (a2) obj7;
                            try {
                                iVar5.getClass();
                                g0.f0 f0VarE = a2Var3.e();
                                Size sizeD = a2Var3.d();
                                if (f0VarE == null || sizeD == null) {
                                    b2Var = null;
                                } else {
                                    Rect rect = a2Var3.f211k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                                    }
                                    b2Var = new b2(sizeD, rect, a2Var3.j(f0VarE, false));
                                }
                                listF4 = kotlin.collections.r.c(b2Var);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        case 4:
                            l6.i iVar6 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var4 = (a2) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                iVar6.getClass();
                                if (a2Var4.C((int) jLongValue2)) {
                                    a2Var4.H();
                                }
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                        default:
                            l6.i iVar7 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) iVar7.f27979d).get((a2) obj10);
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof p) {
                                    p pVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            listF6 = kotlin.collections.r.c(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            reply.i(listF6);
                            return;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Preview.setSurfaceProvider", mVarA, obj);
        if (iVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.y0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List listF4;
                    b2 b2Var;
                    List listF5;
                    List listF6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    switch (i10) {
                        case 0:
                            l6.i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                fj.c cVar = (fj.c) ((ji0) iVar2.f27978c).f6853d;
                                q1 q1Var = new a0.t0(2).f224b;
                                if (l10 != null) {
                                    int iIntValue = l10.intValue();
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(iIntValue));
                                    q1Var.y(g0.i1.f19606k, Integer.valueOf(iIntValue));
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                v1 v1Var = new v1(u1.u(q1Var));
                                g0.i1.r(v1Var);
                                a2 a2Var = new a2(v1Var);
                                a2Var.f17r = a2.f15y;
                                cVar.a(jLongValue, a2Var);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 1:
                            l6.i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var2 = (a2) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj5;
                            try {
                                io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) ((ji0) iVar3.f27978c).f6856g;
                                jVar.getClass();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
                                a2Var2.I(new com.google.firebase.messaging.o(iVar3, textureRegistry$SurfaceProducerD, m1Var, 13));
                                ((HashMap) iVar3.f27979d).put(a2Var2, textureRegistry$SurfaceProducerD);
                                listF2 = kotlin.collections.r.c(Long.valueOf(textureRegistry$SurfaceProducerD.id()));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 2:
                            l6.i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) iVar4.f27979d).remove((a2) obj6);
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            listF3 = kotlin.collections.r.c(null);
                            reply.i(listF3);
                            return;
                        case 3:
                            l6.i iVar5 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var3 = (a2) obj7;
                            try {
                                iVar5.getClass();
                                g0.f0 f0VarE = a2Var3.e();
                                Size sizeD = a2Var3.d();
                                if (f0VarE == null || sizeD == null) {
                                    b2Var = null;
                                } else {
                                    Rect rect = a2Var3.f211k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                                    }
                                    b2Var = new b2(sizeD, rect, a2Var3.j(f0VarE, false));
                                }
                                listF4 = kotlin.collections.r.c(b2Var);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        case 4:
                            l6.i iVar6 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var4 = (a2) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                iVar6.getClass();
                                if (a2Var4.C((int) jLongValue2)) {
                                    a2Var4.H();
                                }
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                        default:
                            l6.i iVar7 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) iVar7.f27979d).get((a2) obj10);
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof p) {
                                    p pVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            listF6 = kotlin.collections.r.c(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            reply.i(listF6);
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Preview.releaseSurfaceProvider", mVarA, obj);
        if (iVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.y0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List listF4;
                    b2 b2Var;
                    List listF5;
                    List listF6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    switch (i11) {
                        case 0:
                            l6.i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                fj.c cVar = (fj.c) ((ji0) iVar2.f27978c).f6853d;
                                q1 q1Var = new a0.t0(2).f224b;
                                if (l10 != null) {
                                    int iIntValue = l10.intValue();
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(iIntValue));
                                    q1Var.y(g0.i1.f19606k, Integer.valueOf(iIntValue));
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                v1 v1Var = new v1(u1.u(q1Var));
                                g0.i1.r(v1Var);
                                a2 a2Var = new a2(v1Var);
                                a2Var.f17r = a2.f15y;
                                cVar.a(jLongValue, a2Var);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 1:
                            l6.i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var2 = (a2) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj5;
                            try {
                                io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) ((ji0) iVar3.f27978c).f6856g;
                                jVar.getClass();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
                                a2Var2.I(new com.google.firebase.messaging.o(iVar3, textureRegistry$SurfaceProducerD, m1Var, 13));
                                ((HashMap) iVar3.f27979d).put(a2Var2, textureRegistry$SurfaceProducerD);
                                listF2 = kotlin.collections.r.c(Long.valueOf(textureRegistry$SurfaceProducerD.id()));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 2:
                            l6.i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) iVar4.f27979d).remove((a2) obj6);
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            listF3 = kotlin.collections.r.c(null);
                            reply.i(listF3);
                            return;
                        case 3:
                            l6.i iVar5 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var3 = (a2) obj7;
                            try {
                                iVar5.getClass();
                                g0.f0 f0VarE = a2Var3.e();
                                Size sizeD = a2Var3.d();
                                if (f0VarE == null || sizeD == null) {
                                    b2Var = null;
                                } else {
                                    Rect rect = a2Var3.f211k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                                    }
                                    b2Var = new b2(sizeD, rect, a2Var3.j(f0VarE, false));
                                }
                                listF4 = kotlin.collections.r.c(b2Var);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        case 4:
                            l6.i iVar6 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var4 = (a2) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                iVar6.getClass();
                                if (a2Var4.C((int) jLongValue2)) {
                                    a2Var4.H();
                                }
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                        default:
                            l6.i iVar7 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) iVar7.f27979d).get((a2) obj10);
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof p) {
                                    p pVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            listF6 = kotlin.collections.r.c(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            reply.i(listF6);
                            return;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Preview.getResolutionInfo", mVarA, obj);
        if (iVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: ni.y0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List listF4;
                    b2 b2Var;
                    List listF5;
                    List listF6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    switch (i12) {
                        case 0:
                            l6.i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                fj.c cVar = (fj.c) ((ji0) iVar2.f27978c).f6853d;
                                q1 q1Var = new a0.t0(2).f224b;
                                if (l10 != null) {
                                    int iIntValue = l10.intValue();
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(iIntValue));
                                    q1Var.y(g0.i1.f19606k, Integer.valueOf(iIntValue));
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                v1 v1Var = new v1(u1.u(q1Var));
                                g0.i1.r(v1Var);
                                a2 a2Var = new a2(v1Var);
                                a2Var.f17r = a2.f15y;
                                cVar.a(jLongValue, a2Var);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 1:
                            l6.i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var2 = (a2) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj5;
                            try {
                                io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) ((ji0) iVar3.f27978c).f6856g;
                                jVar.getClass();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
                                a2Var2.I(new com.google.firebase.messaging.o(iVar3, textureRegistry$SurfaceProducerD, m1Var, 13));
                                ((HashMap) iVar3.f27979d).put(a2Var2, textureRegistry$SurfaceProducerD);
                                listF2 = kotlin.collections.r.c(Long.valueOf(textureRegistry$SurfaceProducerD.id()));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 2:
                            l6.i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) iVar4.f27979d).remove((a2) obj6);
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            listF3 = kotlin.collections.r.c(null);
                            reply.i(listF3);
                            return;
                        case 3:
                            l6.i iVar5 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var3 = (a2) obj7;
                            try {
                                iVar5.getClass();
                                g0.f0 f0VarE = a2Var3.e();
                                Size sizeD = a2Var3.d();
                                if (f0VarE == null || sizeD == null) {
                                    b2Var = null;
                                } else {
                                    Rect rect = a2Var3.f211k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                                    }
                                    b2Var = new b2(sizeD, rect, a2Var3.j(f0VarE, false));
                                }
                                listF4 = kotlin.collections.r.c(b2Var);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        case 4:
                            l6.i iVar6 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var4 = (a2) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                iVar6.getClass();
                                if (a2Var4.C((int) jLongValue2)) {
                                    a2Var4.H();
                                }
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                        default:
                            l6.i iVar7 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) iVar7.f27979d).get((a2) obj10);
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof p) {
                                    p pVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            listF6 = kotlin.collections.r.c(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            reply.i(listF6);
                            return;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Preview.setTargetRotation", mVarA, obj);
        if (iVar != null) {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: ni.y0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List listF4;
                    b2 b2Var;
                    List listF5;
                    List listF6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    switch (i13) {
                        case 0:
                            l6.i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                fj.c cVar = (fj.c) ((ji0) iVar2.f27978c).f6853d;
                                q1 q1Var = new a0.t0(2).f224b;
                                if (l10 != null) {
                                    int iIntValue = l10.intValue();
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(iIntValue));
                                    q1Var.y(g0.i1.f19606k, Integer.valueOf(iIntValue));
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                v1 v1Var = new v1(u1.u(q1Var));
                                g0.i1.r(v1Var);
                                a2 a2Var = new a2(v1Var);
                                a2Var.f17r = a2.f15y;
                                cVar.a(jLongValue, a2Var);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 1:
                            l6.i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var2 = (a2) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj5;
                            try {
                                io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) ((ji0) iVar3.f27978c).f6856g;
                                jVar.getClass();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
                                a2Var2.I(new com.google.firebase.messaging.o(iVar3, textureRegistry$SurfaceProducerD, m1Var, 13));
                                ((HashMap) iVar3.f27979d).put(a2Var2, textureRegistry$SurfaceProducerD);
                                listF2 = kotlin.collections.r.c(Long.valueOf(textureRegistry$SurfaceProducerD.id()));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 2:
                            l6.i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) iVar4.f27979d).remove((a2) obj6);
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            listF3 = kotlin.collections.r.c(null);
                            reply.i(listF3);
                            return;
                        case 3:
                            l6.i iVar5 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var3 = (a2) obj7;
                            try {
                                iVar5.getClass();
                                g0.f0 f0VarE = a2Var3.e();
                                Size sizeD = a2Var3.d();
                                if (f0VarE == null || sizeD == null) {
                                    b2Var = null;
                                } else {
                                    Rect rect = a2Var3.f211k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                                    }
                                    b2Var = new b2(sizeD, rect, a2Var3.j(f0VarE, false));
                                }
                                listF4 = kotlin.collections.r.c(b2Var);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        case 4:
                            l6.i iVar6 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var4 = (a2) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                iVar6.getClass();
                                if (a2Var4.C((int) jLongValue2)) {
                                    a2Var4.H();
                                }
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                        default:
                            l6.i iVar7 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) iVar7.f27979d).get((a2) obj10);
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof p) {
                                    p pVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            listF6 = kotlin.collections.r.c(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            reply.i(listF6);
                            return;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Preview.surfaceProducerHandlesCropAndRotation", mVarA, obj);
        if (iVar == null) {
            gVar6.L(null);
        } else {
            final int i14 = 5;
            gVar6.L(new ii.b() { // from class: ni.y0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List listF4;
                    b2 b2Var;
                    List listF5;
                    List listF6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    switch (i14) {
                        case 0:
                            l6.i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                fj.c cVar = (fj.c) ((ji0) iVar2.f27978c).f6853d;
                                q1 q1Var = new a0.t0(2).f224b;
                                if (l10 != null) {
                                    int iIntValue = l10.intValue();
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(iIntValue));
                                    q1Var.y(g0.i1.f19606k, Integer.valueOf(iIntValue));
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                v1 v1Var = new v1(u1.u(q1Var));
                                g0.i1.r(v1Var);
                                a2 a2Var = new a2(v1Var);
                                a2Var.f17r = a2.f15y;
                                cVar.a(jLongValue, a2Var);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 1:
                            l6.i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var2 = (a2) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj5;
                            try {
                                io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) ((ji0) iVar3.f27978c).f6856g;
                                jVar.getClass();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(1);
                                a2Var2.I(new com.google.firebase.messaging.o(iVar3, textureRegistry$SurfaceProducerD, m1Var, 13));
                                ((HashMap) iVar3.f27979d).put(a2Var2, textureRegistry$SurfaceProducerD);
                                listF2 = kotlin.collections.r.c(Long.valueOf(textureRegistry$SurfaceProducerD.id()));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 2:
                            l6.i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) iVar4.f27979d).remove((a2) obj6);
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            listF3 = kotlin.collections.r.c(null);
                            reply.i(listF3);
                            return;
                        case 3:
                            l6.i iVar5 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var3 = (a2) obj7;
                            try {
                                iVar5.getClass();
                                g0.f0 f0VarE = a2Var3.e();
                                Size sizeD = a2Var3.d();
                                if (f0VarE == null || sizeD == null) {
                                    b2Var = null;
                                } else {
                                    Rect rect = a2Var3.f211k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
                                    }
                                    b2Var = new b2(sizeD, rect, a2Var3.j(f0VarE, false));
                                }
                                listF4 = kotlin.collections.r.c(b2Var);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        case 4:
                            l6.i iVar6 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            a2 a2Var4 = (a2) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                iVar6.getClass();
                                if (a2Var4.C((int) jLongValue2)) {
                                    a2Var4.H();
                                }
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                        default:
                            l6.i iVar7 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.Preview");
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) iVar7.f27979d).get((a2) obj10);
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof p) {
                                    p pVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            listF6 = kotlin.collections.r.c(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            reply.i(listF6);
                            return;
                    }
                }
            });
        }
    }

    public static ArrayList z(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        if (th2 instanceof yi.b) {
            yi.b bVar = (yi.b) th2;
            arrayList.add(bVar.f45632b);
            arrayList.add(bVar.getMessage());
            arrayList.add(bVar.f45633c);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public abstract na.l a();

    public abstract boolean c(w7.h hVar, w7.c cVar, w7.c cVar2);

    public abstract boolean d(w7.h hVar, Object obj, Object obj2);

    public abstract boolean e(w7.h hVar, w7.g gVar, w7.g gVar2);

    public abstract List g(String str, List list);

    public abstract void u(w7.g gVar, w7.g gVar2);

    public abstract void v(w7.g gVar, Thread thread);
}
