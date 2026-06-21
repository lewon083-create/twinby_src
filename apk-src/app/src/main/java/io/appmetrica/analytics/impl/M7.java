package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f22665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f22666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K7 f22667d;

    public M7(boolean z5) {
        this.f22664a = z5;
    }

    public final void a(int i) {
        K7 k7 = this.f22667d;
        String str = k7 == null ? null : k7.f22560c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f22665b;
        if (deferredDeeplinkListener != null) {
            if (i == 0) {
                throw null;
            }
            int i10 = i - 1;
            deferredDeeplinkListener.onError(i10 != 0 ? i10 != 1 ? i10 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f22665b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f22666c;
        if (deferredDeeplinkParametersListener != null) {
            if (i == 0) {
                throw null;
            }
            int i11 = i - 1;
            deferredDeeplinkParametersListener.onError(i11 != 0 ? i11 != 1 ? i11 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f22666c = null;
        }
    }

    public final void a() {
        K7 k7 = this.f22667d;
        if (k7 != null) {
            String str = k7.f22559b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f22665b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f22665b = null;
                }
                if (!ko.a(this.f22667d.f22558a)) {
                    Map<String, String> map = this.f22667d.f22558a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f22666c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f22666c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f22667d.f22560c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f22666c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f22666c = null;
                    return;
                }
                return;
            }
            if (k7.f22560c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
