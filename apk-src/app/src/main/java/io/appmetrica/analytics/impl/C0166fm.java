package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0166fm implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0635ye f23892a = new C0635ye();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0180ga f23893b = new C0180ga();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gm f23894c = new Gm();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0173g3 f23895d = new C0173g3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0374o2 f23896e = new C0374o2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0602x6 f23897f = new C0602x6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cm f23898g = new Cm();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0410pd f23899h = new C0410pd();
    public final D9 i = new D9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0568vm fromModel(@NonNull C0243im c0243im) {
        C0568vm c0568vm = new C0568vm();
        c0568vm.f24936s = c0243im.f24112u;
        c0568vm.f24937t = c0243im.f24113v;
        String str = c0243im.f24093a;
        if (str != null) {
            c0568vm.f24919a = str;
        }
        List list = c0243im.f24098f;
        if (list != null) {
            c0568vm.f24924f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0243im.f24099g;
        if (list2 != null) {
            c0568vm.f24925g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0243im.f24094b;
        if (list3 != null) {
            c0568vm.f24921c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0243im.f24100h;
        if (list4 != null) {
            c0568vm.f24932o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0243im.i;
        if (map != null) {
            c0568vm.f24926h = this.f23897f.fromModel(map);
        }
        C0610xe c0610xe = c0243im.f24110s;
        if (c0610xe != null) {
            c0568vm.f24939v = this.f23892a.fromModel(c0610xe);
        }
        String str2 = c0243im.f24101j;
        if (str2 != null) {
            c0568vm.f24927j = str2;
        }
        String str3 = c0243im.f24095c;
        if (str3 != null) {
            c0568vm.f24922d = str3;
        }
        String str4 = c0243im.f24096d;
        if (str4 != null) {
            c0568vm.f24923e = str4;
        }
        String str5 = c0243im.f24097e;
        if (str5 != null) {
            c0568vm.f24935r = str5;
        }
        c0568vm.i = this.f23893b.fromModel(c0243im.f24104m);
        String str6 = c0243im.f24102k;
        if (str6 != null) {
            c0568vm.f24928k = str6;
        }
        String str7 = c0243im.f24103l;
        if (str7 != null) {
            c0568vm.f24929l = str7;
        }
        c0568vm.f24930m = c0243im.f24107p;
        c0568vm.f24920b = c0243im.f24105n;
        c0568vm.f24934q = c0243im.f24106o;
        RetryPolicyConfig retryPolicyConfig = c0243im.f24111t;
        c0568vm.f24940w = retryPolicyConfig.maxIntervalSeconds;
        c0568vm.f24941x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0243im.f24108q;
        if (str8 != null) {
            c0568vm.f24931n = str8;
        }
        Fm fm = c0243im.f24109r;
        if (fm != null) {
            this.f23894c.getClass();
            C0543um c0543um = new C0543um();
            c0543um.f24858a = fm.f22352a;
            c0568vm.f24933p = c0543um;
        }
        c0568vm.f24938u = c0243im.f24114w;
        C0121e3 c0121e3 = c0243im.f24115x;
        if (c0121e3 != null) {
            this.f23895d.getClass();
            C0369nm c0369nm = new C0369nm();
            c0369nm.f24455a = c0121e3.f23727a;
            c0568vm.f24942y = c0369nm;
        }
        C0349n2 c0349n2 = c0243im.f24116y;
        if (c0349n2 != null) {
            c0568vm.f24943z = this.f23896e.fromModel(c0349n2);
        }
        c0568vm.A = this.f23898g.fromModel(c0243im.f24117z);
        c0568vm.B = this.f23899h.fromModel(c0243im.A);
        c0568vm.C = this.i.fromModel(c0243im.B);
        return c0568vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0243im toModel(@NonNull C0568vm c0568vm) {
        C0218hm c0218hm = new C0218hm(this.f23893b.toModel(c0568vm.i));
        c0218hm.f23999a = c0568vm.f24919a;
        c0218hm.f24007j = c0568vm.f24927j;
        c0218hm.f24001c = c0568vm.f24922d;
        c0218hm.f24000b = Arrays.asList(c0568vm.f24921c);
        c0218hm.f24005g = Arrays.asList(c0568vm.f24925g);
        c0218hm.f24004f = Arrays.asList(c0568vm.f24924f);
        c0218hm.f24002d = c0568vm.f24923e;
        c0218hm.f24003e = c0568vm.f24935r;
        c0218hm.f24006h = Arrays.asList(c0568vm.f24932o);
        c0218hm.f24008k = c0568vm.f24928k;
        c0218hm.f24009l = c0568vm.f24929l;
        c0218hm.f24014q = c0568vm.f24930m;
        c0218hm.f24012o = c0568vm.f24920b;
        c0218hm.f24013p = c0568vm.f24934q;
        c0218hm.f24017t = c0568vm.f24936s;
        c0218hm.f24018u = c0568vm.f24937t;
        c0218hm.f24015r = c0568vm.f24931n;
        c0218hm.f24019v = c0568vm.f24938u;
        c0218hm.f24020w = new RetryPolicyConfig(c0568vm.f24940w, c0568vm.f24941x);
        c0218hm.i = this.f23897f.toModel(c0568vm.f24926h);
        C0493sm c0493sm = c0568vm.f24939v;
        if (c0493sm != null) {
            this.f23892a.getClass();
            c0218hm.f24011n = new C0610xe(c0493sm.f24745a, c0493sm.f24746b);
        }
        C0543um c0543um = c0568vm.f24933p;
        if (c0543um != null) {
            this.f23894c.getClass();
            c0218hm.f24016s = new Fm(c0543um.f24858a);
        }
        C0369nm c0369nm = c0568vm.f24942y;
        if (c0369nm != null) {
            this.f23895d.getClass();
            c0218hm.f24021x = new C0121e3(c0369nm.f24455a);
        }
        C0344mm c0344mm = c0568vm.f24943z;
        if (c0344mm != null) {
            c0218hm.f24022y = this.f23896e.toModel(c0344mm);
        }
        C0518tm c0518tm = c0568vm.A;
        if (c0518tm != null) {
            this.f23898g.getClass();
            c0218hm.f24023z = new Bm(c0518tm.f24815a);
        }
        c0218hm.A = this.f23899h.toModel(c0568vm.B);
        C0419pm c0419pm = c0568vm.C;
        if (c0419pm != null) {
            this.i.getClass();
            c0218hm.B = new C9(c0419pm.f24594a);
        }
        return new C0243im(c0218hm);
    }
}
