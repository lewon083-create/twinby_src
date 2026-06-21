package io.appmetrica.analytics.flutter;

import android.content.Context;
import androidx.annotation.NonNull;
import ei.b;
import fi.a;
import ii.f;
import io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl;
import io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl;
import io.appmetrica.analytics.flutter.impl.ReporterImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaPlugin implements b, a {
    private AppMetricaImpl appMetrica = null;
    private AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // fi.a
    public void onAttachedToActivity(@NonNull fi.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (w) ((h3) bVar).f28250b;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (w) ((h3) bVar).f28250b;
        }
    }

    @Override // ei.b
    public void onAttachedToEngine(@NonNull ei.a aVar) {
        this.appMetrica = new AppMetricaImpl(aVar.f16381a);
        Context context = aVar.f16381a;
        this.appMetricaLibraryAdapter = new AppMetricaLibraryAdapterImpl(context);
        this.deeplinkHolder = new InitialDeepLinkHolderImpl();
        f fVar = aVar.f16383c;
        Pigeon.AppMetricaPigeon.setup(fVar, this.appMetrica);
        Pigeon.AppMetricaLibraryAdapterPigeon.setup(fVar, this.appMetricaLibraryAdapter);
        Pigeon.ReporterPigeon.setup(fVar, new ReporterImpl(context));
        Pigeon.AppMetricaConfigConverterPigeon.setup(fVar, new AppMetricaConfigConverterImpl());
        Pigeon.InitialDeepLinkHolderPigeon.setup(fVar, this.deeplinkHolder);
    }

    @Override // fi.a
    public void onDetachedFromActivity() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // fi.a
    public void onDetachedFromActivityForConfigChanges() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // fi.a
    public void onReattachedToActivityForConfigChanges(@NonNull fi.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (w) ((h3) bVar).f28250b;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (w) ((h3) bVar).f28250b;
        }
    }

    @Override // ei.b
    public void onDetachedFromEngine(@NonNull ei.a aVar) {
    }
}
