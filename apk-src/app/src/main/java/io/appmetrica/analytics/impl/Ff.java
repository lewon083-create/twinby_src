package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ff implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0485se f22332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0586wf f22333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0325m3 f22334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hf f22335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0506ta f22336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0506ta f22337f;

    public Ff() {
        this(new C0485se(), new C0586wf(), new C0325m3(), new Hf(), new C0506ta(100), new C0506ta(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull Gf gf2) {
        Ci ciFromModel;
        Ci ciFromModel2;
        Ci ciA;
        Ci ciA2;
        C0380o8 c0380o8 = new C0380o8();
        Ln lnA = this.f22336e.a(gf2.f22383a);
        c0380o8.f24481a = StringUtils.getUTF8Bytes((String) lnA.f22635a);
        Ln lnA2 = this.f22337f.a(gf2.f22384b);
        c0380o8.f24482b = StringUtils.getUTF8Bytes((String) lnA2.f22635a);
        List<String> list = gf2.f22385c;
        Ci ciFromModel3 = null;
        if (list != null) {
            ciFromModel = this.f22334c.fromModel(list);
            c0380o8.f24483c = (C0178g8) ciFromModel.f22216a;
        } else {
            ciFromModel = null;
        }
        Map<String, String> map = gf2.f22386d;
        if (map != null) {
            ciFromModel2 = this.f22332a.fromModel(map);
            c0380o8.f24484d = (C0330m8) ciFromModel2.f22216a;
        } else {
            ciFromModel2 = null;
        }
        C0636yf c0636yf = gf2.f22387e;
        if (c0636yf != null) {
            ciA = this.f22333b.fromModel(c0636yf);
            c0380o8.f24485e = (C0355n8) ciA.f22216a;
        } else {
            ciA = null;
        }
        C0636yf c0636yf2 = gf2.f22388f;
        if (c0636yf2 != null) {
            ciA2 = this.f22333b.fromModel(c0636yf2);
            c0380o8.f24486f = (C0355n8) ciA2.f22216a;
        } else {
            ciA2 = null;
        }
        List<String> list2 = gf2.f22389g;
        if (list2 != null) {
            ciFromModel3 = this.f22335d.fromModel(list2);
            c0380o8.f24487g = (C0405p8[]) ciFromModel3.f22216a;
        }
        return new Ci(c0380o8, new C0044b3(C0044b3.b(lnA, lnA2, ciFromModel, ciFromModel2, ciA, ciA2, ciFromModel3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ff(C0485se c0485se, C0586wf c0586wf, C0325m3 c0325m3, Hf hf2, C0506ta c0506ta, C0506ta c0506ta2) {
        this.f22332a = c0485se;
        this.f22333b = c0586wf;
        this.f22334c = c0325m3;
        this.f22335d = hf2;
        this.f22336e = c0506ta;
        this.f22337f = c0506ta2;
    }

    @NonNull
    public final Gf a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
