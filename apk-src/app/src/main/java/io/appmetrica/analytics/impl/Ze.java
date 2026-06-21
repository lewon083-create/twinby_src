package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ze implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0387of f23385a;

    public Ze() {
        this(new C0387of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0312lf fromModel(@NonNull C0056bf c0056bf) {
        C0312lf c0312lf = new C0312lf();
        if (!TextUtils.isEmpty(c0056bf.f23502a)) {
            c0312lf.f24298a = c0056bf.f23502a;
        }
        c0312lf.f24299b = c0056bf.f23503b.toString();
        c0312lf.f24300c = this.f23385a.fromModel(c0056bf.f23504c).intValue();
        return c0312lf;
    }

    public Ze(C0387of c0387of) {
        this.f23385a = c0387of;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0056bf toModel(@NonNull C0312lf c0312lf) {
        JSONObject jSONObject;
        String str = c0312lf.f24298a;
        String str2 = c0312lf.f24299b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C0056bf(str, jSONObject, this.f23385a.toModel(Integer.valueOf(c0312lf.f24300c)));
    }
}
