package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0437qf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0387of f24635a = new C0387of();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0287kf fromModel(@NonNull C0412pf c0412pf) {
        C0287kf c0287kf = new C0287kf();
        if (!TextUtils.isEmpty(c0412pf.f24581a)) {
            c0287kf.f24235a = c0412pf.f24581a;
        }
        c0287kf.f24236b = c0412pf.f24582b.toString();
        c0287kf.f24237c = c0412pf.f24583c;
        c0287kf.f24238d = c0412pf.f24584d;
        c0287kf.f24239e = this.f24635a.fromModel(c0412pf.f24585e).intValue();
        return c0287kf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0412pf toModel(@NonNull C0287kf c0287kf) {
        JSONObject jSONObject;
        String str = c0287kf.f24235a;
        String str2 = c0287kf.f24236b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C0412pf(str, jSONObject, c0287kf.f24237c, c0287kf.f24238d, this.f24635a.toModel(Integer.valueOf(c0287kf.f24239e)));
    }
}
