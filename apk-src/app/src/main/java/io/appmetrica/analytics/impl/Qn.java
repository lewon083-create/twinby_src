package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Qn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final En f22900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f22901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0228i6 f22902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Al f22903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final He f22904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ie f22905f;

    public Qn() {
        this(new En(), new W(new C0594wn()), new C0228i6(), new Al(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@NonNull Pn pn) {
        W5 w52 = new W5();
        Fn fn = pn.f22840a;
        if (fn != null) {
            w52.f23202a = this.f22900a.fromModel(fn);
        }
        V v5 = pn.f22841b;
        if (v5 != null) {
            w52.f23203b = this.f22901b.fromModel(v5);
        }
        List<Cl> list = pn.f22842c;
        if (list != null) {
            w52.f23206e = this.f22903d.fromModel(list);
        }
        String str = pn.f22846g;
        if (str != null) {
            w52.f23204c = str;
        }
        w52.f23205d = this.f22902c.a(pn.f22847h);
        if (!TextUtils.isEmpty(pn.f22843d)) {
            w52.f23209h = this.f22904e.fromModel(pn.f22843d);
        }
        if (!TextUtils.isEmpty(pn.f22844e)) {
            w52.i = pn.f22844e.getBytes();
        }
        if (!ko.a(pn.f22845f)) {
            w52.f23210j = this.f22905f.fromModel(pn.f22845f);
        }
        return w52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Qn(En en, W w10, C0228i6 c0228i6, Al al2, He he2, Ie ie) {
        this.f22901b = w10;
        this.f22900a = en;
        this.f22902c = c0228i6;
        this.f22903d = al2;
        this.f22904e = he2;
        this.f22905f = ie;
    }

    @NonNull
    public final Pn a(@NonNull W5 w52) {
        throw new UnsupportedOperationException();
    }
}
