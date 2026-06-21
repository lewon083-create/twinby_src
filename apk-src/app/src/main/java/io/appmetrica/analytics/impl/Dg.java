package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Dg implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final En f22251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f22252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0228i6 f22253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Al f22254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final He f22255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ie f22256f;

    public Dg() {
        this(new En(), new W(new C0594wn()), new C0228i6(), new Al(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull Cg cg) {
        Y5 y52 = new Y5();
        y52.f23313f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(cg.f22212a, y52.f23313f));
        Pn pn = cg.f22213b;
        if (pn != null) {
            Fn fn = pn.f22840a;
            if (fn != null) {
                y52.f23308a = this.f22251a.fromModel(fn);
            }
            V v5 = pn.f22841b;
            if (v5 != null) {
                y52.f23309b = this.f22252b.fromModel(v5);
            }
            List<Cl> list = pn.f22842c;
            if (list != null) {
                y52.f23312e = this.f22254d.fromModel(list);
            }
            y52.f23310c = (String) WrapUtils.getOrDefault(pn.f22846g, y52.f23310c);
            y52.f23311d = this.f22253c.a(pn.f22847h);
            if (!TextUtils.isEmpty(pn.f22843d)) {
                y52.i = this.f22255e.fromModel(pn.f22843d);
            }
            if (!TextUtils.isEmpty(pn.f22844e)) {
                y52.f23316j = pn.f22844e.getBytes();
            }
            if (!ko.a(pn.f22845f)) {
                y52.f23317k = this.f22256f.fromModel(pn.f22845f);
            }
        }
        return y52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Dg(En en, W w10, C0228i6 c0228i6, Al al2, He he2, Ie ie) {
        this.f22251a = en;
        this.f22252b = w10;
        this.f22253c = c0228i6;
        this.f22254d = al2;
        this.f22255e = he2;
        this.f22256f = ie;
    }

    @NonNull
    public final Cg a(@NonNull Y5 y52) {
        throw new UnsupportedOperationException();
    }
}
