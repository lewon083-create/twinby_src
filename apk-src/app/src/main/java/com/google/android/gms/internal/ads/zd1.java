package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryThread;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class zd1 implements ce1, m9, pa.c, pa.b, t81, k81, e80, vm, uh0, h90, nr0, j1.i, df1, be0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12972d;

    public zd1(int i) {
        this.f12970b = i;
        switch (i) {
            case 24:
                zd1 zd1Var = pn1.D;
                this.f12971c = new l91((l91) zd1Var.f12971c);
                this.f12972d = Arrays.copyOf((long[]) zd1Var.f12972d, 10);
                break;
            default:
                nu0 nu0Var = new nu0(0);
                this.f12971c = nu0Var;
                this.f12972d = new pp0(3, nu0Var);
                break;
        }
    }

    public static zd1 q(mh1 mh1Var) {
        return new zd1(0, mh1Var, ge1.a(mh1Var.z()));
    }

    public void A(int i, int i10, int i11, int i12) {
        try {
            ((sz) this.f12971c).h("onSizeChanged", new JSONObject().put("x", i).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e3) {
            u9.i.f("Error occurred while dispatching size change.", e3);
        }
    }

    public void B(String str) {
        try {
            ((sz) this.f12971c).h("onStateChanged", new JSONObject().put(SentryThread.JsonKeys.STATE, str));
        } catch (JSONException e3) {
            u9.i.f("Error occurred while dispatching state change.", e3);
        }
    }

    public void C(int i, int i10, int i11, int i12, float f10, int i13) {
        try {
            ((sz) this.f12971c).h("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f10).put("rotation", i13));
        } catch (JSONException e3) {
            u9.i.f("Error occurred while obtaining screen information.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f12970b) {
            case 11:
                ((k80) obj).g((String) this.f12971c, (String) this.f12972d);
                break;
            default:
                or0 or0Var = (or0) this.f12971c;
                ((sr0) obj).g((pr0) or0Var.f8765b, or0Var.f8766c, (Throwable) this.f12972d);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.df1
    public byte[] b(int i, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f12970b) {
            case 26:
                if (i > 16) {
                    throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
                }
                Provider provider = (Provider) this.f12972d;
                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f12971c;
                Mac mac = Mac.getInstance("AESCMAC", provider);
                mac.init(secretKeySpec);
                byte[] bArrDoFinal = mac.doFinal(bArr);
                return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
            default:
                return bArr.length <= 64 ? ((ef1) this.f12971c).b(i, bArr) : ((zd1) this.f12972d).b(i, bArr);
        }
    }

    @Override // pa.c
    public void c0(ma.b bVar) {
        synchronized (((com.google.android.gms.internal.measurement.i4) this.f12972d).f13783d) {
            ((ni) this.f12971c).d(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void d(boolean z5, Context context, o60 o60Var) throws g90 {
        try {
            pq0 pq0Var = (pq0) ((ci0) this.f12971c).f4217b;
            pq0Var.b(z5);
            try {
                pq0Var.f9154a.C2(new xa.b(context));
            } catch (Throwable th2) {
                throw new kq0(th2);
            }
        } catch (kq0 e3) {
            throw new g90(e3.getCause());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.ug] */
    @Override // com.google.android.gms.internal.ads.vm
    public void e(MotionEvent motionEvent) {
        ((ug) this.f12971c).onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.be0
    public /* synthetic */ void f(Object obj, cw1 cw1Var) {
        yu1 yu1Var = (yu1) obj;
        yu1Var.i((ip1) this.f12972d, new ut(cw1Var, ((bv1) this.f12971c).f3918e));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    @Override // com.google.android.gms.internal.ads.vm
    public JSONObject g() {
        return ((ug) this.f12971c).o();
    }

    @Override // com.google.android.gms.internal.ads.t81
    /* JADX INFO: renamed from: h */
    public /* synthetic */ g91 mo1h() {
        AtomicInteger atomicInteger = jz.f7008v;
        g91 g91VarMo1h = ((t81) this.f12971c).mo1h();
        byte[] bArr = (byte[]) this.f12972d;
        return new gz(new q51(bArr), bArr.length, g91VarMo1h);
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        Bundle bundle;
        switch (this.f12970b) {
            case 9:
                String str = (String) this.f12971c;
                String str2 = (String) obj;
                e30 e30Var = (e30) this.f12972d;
                e30Var.i.a(e30Var.f4814h.b(e30Var.f4812f, e30Var.f4813g, false, str, str2, e30Var.a(), e30Var.f4821p, e30Var.f4825t), e30Var.f4820o);
                return;
            case 10:
                List list = ((u40) obj).f10815a;
                z7 z7Var = (z7) this.f12971c;
                x40 x40Var = (x40) this.f12972d;
                Executor executor = x40Var.f12015a;
                if (list == null || list.isEmpty()) {
                    executor.execute(new w40(z7Var, 0));
                    return;
                }
                ed.d dVarJ = n81.f8237c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dVarJ = vv.J(vv.H(dVarJ, Throwable.class, new np(3, z7Var), executor), new v40(x40Var, z7Var, (ed.d) it.next(), 0), executor);
                }
                dVarJ.a(new l81(0, dVarJ, new ut(x40Var, z7Var)), executor);
                return;
            case 11:
            case 12:
            case 14:
            default:
                g gVar = (g) this.f12972d;
                synchronized (gVar) {
                    try {
                        gVar.f5556f = null;
                        ((ArrayDeque) gVar.f5555e).addFirst((to0) this.f12971c);
                        if (gVar.f5552b == 1) {
                            gVar.f();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 13:
                ((sz) obj).u0((String) this.f12971c, (vo) this.f12972d);
                return;
            case 15:
                hu huVar = (hu) this.f12972d;
                ku kuVar = (ku) this.f12971c;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    wk wkVar = al.B2;
                    q9.s sVar = q9.s.f31967e;
                    if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        huVar.Y2(parcelFileDescriptor);
                        return;
                    }
                    if (((Boolean) sVar.f31970c.a(al.C2)).booleanValue() && (bundle = kuVar.f7308n) != null) {
                        p9.k.C.f31304k.getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    huVar.a3(parcelFileDescriptor, kuVar);
                    return;
                } catch (RemoteException e3) {
                    t9.c0.n("Service can't call client", e3);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        return (xp0) this.f12972d;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f12970b) {
            case 9:
                e30 e30Var = (e30) this.f12972d;
                e30Var.i.a(e30Var.f4814h.b(e30Var.f4812f, e30Var.f4813g, false, (String) this.f12971c, null, e30Var.a(), e30Var.f4821p, e30Var.f4825t), null);
                return;
            case 10:
                ((z7) this.f12971c).k(th2);
                x40 x40Var = (x40) this.f12972d;
                x40Var.getClass();
                hx.f6284f.execute(new h30(2, x40Var));
                return;
            case 11:
            case 12:
            case 14:
            default:
                g gVar = (g) this.f12972d;
                synchronized (gVar) {
                    gVar.f5556f = null;
                    break;
                }
                return;
            case 13:
                return;
            case 15:
                try {
                    hu huVar = (hu) this.f12972d;
                    q9.x1 x1VarI = vv.i(th2);
                    huVar.g1(new t9.o(fs1.n(th2.getMessage()) ? x1VarI.f31977c : th2.getMessage(), x1VarI.f31976b));
                    return;
                } catch (RemoteException e3) {
                    t9.c0.n("Service can't call client", e3);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    @Override // com.google.android.gms.internal.ads.vm
    public JSONObject l() {
        return ((ug) this.f12971c).s();
    }

    @Override // pa.b
    public void l0(int i) {
        ((jx) this.f12971c).d(new RuntimeException(l7.o.j(i, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i).length() + 23))));
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        String str;
        String str2;
        Context context = (Context) this.f12971c;
        ux0 ux0Var = (ux0) this.f12972d;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.b("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            String[] strArr = {ux0Var.P(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i10];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i10++;
            }
            f61 f61Var = i61.f6401f;
            byte[] bArrH = f61Var.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH)));
            if (!Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER)) {
                String[] strArr2 = {ux0Var.Q(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                while (true) {
                    if (i >= 2) {
                        str2 = "";
                        break;
                    }
                    str2 = strArr2[i];
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                    i++;
                }
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(f61Var.f().h(str2))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new ie(2, hVar));
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            hVar.b("");
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.m9
    public void n(tk0 tk0Var) {
        p9 p9Var = (p9) this.f12972d;
        if (tk0Var.K() == 0 && (tk0Var.K() & 128) != 0) {
            tk0Var.G(6);
            int iB = tk0Var.B() / 4;
            for (int i = 0; i < iB; i++) {
                ik0 ik0Var = (ik0) this.f12971c;
                tk0Var.H(ik0Var.f6518a, 0, 4);
                ik0Var.d(0);
                int iH = ik0Var.h(16);
                ik0Var.f(3);
                if (iH == 0) {
                    ik0Var.f(13);
                } else {
                    int iH2 = ik0Var.h(13);
                    if (p9Var.f8985f.get(iH2) == null) {
                        p9Var.f8985f.put(iH2, new n9(new g(p9Var, iH2)));
                    }
                }
            }
            p9Var.f8985f.remove(0);
        }
    }

    @Override // pa.b
    public void n0() {
        try {
            ((jx) this.f12971c).b((kp) ((ki) ((ma.k) this.f12972d).f28784c).n());
        } catch (DeadObjectException e3) {
            ((jx) this.f12971c).d(e3);
        }
    }

    public z1 p(Object... objArr) {
        Constructor constructorH;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12972d;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorH = ((w1) this.f12971c).h();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f12972d).set(true);
                    constructorH = null;
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating extension", e3);
                }
            }
            constructorH = null;
        }
        if (constructorH == null) {
            return null;
        }
        try {
            return (z1) constructorH.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public Enum s(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) ((Map) this.f12972d).get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public void t(xp0 xp0Var) {
        v("aai", xp0Var.f12268w);
        v(CommonUrlParts.REQUEST_ID, xp0Var.f12252n0);
        v("ad_format", xp0.a(xp0Var.f12229b));
    }

    public Object u(Enum r32) throws GeneralSecurityException {
        Object obj = ((Map) this.f12971c).get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }

    public void v(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f12971c).put(str, str2);
    }

    public void w() {
        ((sd0) this.f12972d).f10245b.execute(new rd0(this, 2));
    }

    public u9.k x() {
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.xf)).booleanValue();
        u9.k kVar = u9.k.f34393b;
        if (!zBooleanValue) {
            w();
            return kVar;
        }
        sd0 sd0Var = (sd0) this.f12972d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12971c;
        wd0 wd0Var = sd0Var.f10244a;
        wd0Var.getClass();
        if (concurrentHashMap.isEmpty()) {
            u9.i.c("Empty paramMap.");
            return kVar;
        }
        String strA = wd0Var.f11752f.a(concurrentHashMap);
        t9.c0.m(strA);
        return wd0Var.f11750d.a(strA, null);
    }

    public void y() {
        ((sd0) this.f12972d).f10245b.execute(new rd0(this, 0));
    }

    public void z(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", (String) this.f12972d);
            sz szVar = (sz) this.f12971c;
            if (szVar != null) {
                szVar.h("onError", jSONObjectPut);
            }
        } catch (JSONException e3) {
            u9.i.f("Error occurred while dispatching error event.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.uh0
    public Object h() {
        u9.a aVar = (u9.a) this.f12971c;
        int i = aVar.f34366c;
        int i10 = aVar.f34367d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i10).length());
        sb2.append(i);
        sb2.append(".");
        sb2.append(i10);
        String string = sb2.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(string)) {
                return new yt0(new dl("Google", string), (WebView) this.f12972d);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    public /* synthetic */ zd1(int i, Object obj, Object obj2) {
        this.f12970b = i;
        this.f12972d = obj;
        this.f12971c = obj2;
    }

    public /* synthetic */ zd1(int i, Object obj, Object obj2, boolean z5) {
        this.f12970b = i;
        this.f12971c = obj;
        this.f12972d = obj2;
    }

    public /* synthetic */ zd1(int i, boolean z5) {
        this.f12970b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zd1(eb0 eb0Var, ViewGroup viewGroup) {
        this.f12970b = 12;
        this.f12971c = (ug) eb0Var;
        this.f12972d = viewGroup;
    }

    public /* synthetic */ zd1(Object obj, Object obj2, Object obj3, int i) {
        this.f12970b = i;
        this.f12971c = obj2;
        this.f12972d = obj3;
    }

    public zd1(w1 w1Var) {
        this.f12970b = 1;
        this.f12971c = w1Var;
        this.f12972d = new AtomicBoolean(false);
    }

    public zd1(p9 p9Var) {
        this.f12970b = 3;
        this.f12972d = p9Var;
        this.f12971c = new ik0(4, new byte[4]);
    }

    public zd1(sd0 sd0Var) {
        this.f12970b = 14;
        this.f12972d = sd0Var;
        this.f12971c = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    @Override // com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        switch (this.f12970b) {
            case 12:
                r51 r51Var = ra0.f9770q;
                ?? r12 = (ug) this.f12971c;
                Map mapN = r12.n();
                if (mapN != null) {
                    int i = r51Var.f9715e;
                    int i10 = 0;
                    while (i10 < i) {
                        Object obj = mapN.get((String) r51Var.get(i10));
                        i10++;
                        if (obj != null) {
                            r12.onClick((ViewGroup) this.f12972d);
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                dk0 dk0Var = (dk0) this.f12971c;
                fl flVar = (fl) this.f12972d;
                gl glVar = (gl) dk0Var.f4587d;
                Parcel parcelD0 = glVar.D0();
                vg.e(parcelD0, flVar);
                glVar.L1(parcelD0, 1);
                break;
        }
    }

    public zd1(r51 r51Var, int[] iArr) {
        this.f12970b = 22;
        this.f12971c = x41.v(r51Var);
        this.f12972d = iArr;
    }

    public zd1(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f12970b = 26;
        if (gr.x(1)) {
            this.f12971c = new SecretKeySpec(bArr, "AES");
            this.f12972d = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    private final void r(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.m9
    public void c(yo0 yo0Var, b2 b2Var, r9 r9Var) {
    }
}
