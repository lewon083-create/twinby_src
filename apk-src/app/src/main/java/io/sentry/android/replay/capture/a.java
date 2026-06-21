package io.sentry.android.replay.capture;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import bb.e;
import ci.b;
import ii.q;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.view.FlutterCallbackInformation;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.t0;
import kotlin.jvm.functions.Function2;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25979b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25983f;

    public /* synthetic */ a(e eVar, ci.e eVar2, t0 t0Var, long j10) {
        this.f25981d = eVar;
        this.f25982e = eVar2;
        this.f25983f = t0Var;
        this.f25980c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25979b) {
            case 0:
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3((SessionCaptureStrategy) this.f25981d, (Function2) this.f25982e, this.f25980c, (ScreenshotRecorderConfig) this.f25983f);
                return;
            default:
                e eVar = (e) this.f25981d;
                ci.e eVar2 = (ci.e) this.f25982e;
                t0 t0Var = (t0) this.f25983f;
                String str = (String) ((b) eVar2.f2295d).f2282c;
                AssetManager assets = a.a.f10b.getAssets();
                if (((AtomicBoolean) eVar.f2019c).get()) {
                    return;
                }
                if (t0Var != null) {
                    HashSet hashSet = (HashSet) t0Var.f27180c;
                    Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString((String[]) hashSet.toArray(new String[hashSet.size()])));
                    eVar.f2021e = new FlutterEngine(a.a.f10b, (String[]) hashSet.toArray(new String[hashSet.size()]));
                } else {
                    Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                    eVar.f2021e = new FlutterEngine(a.a.f10b, null);
                }
                FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f25980c);
                if (flutterCallbackInformationLookupCallbackInformation == null) {
                    Log.e("FLTFireBGExecutor", "Failed to find registered callback");
                    return;
                }
                zh.b bVar = ((FlutterEngine) eVar.f2021e).f25543c;
                q qVar = new q(bVar, "plugins.flutter.io/firebase_messaging_background");
                eVar.f2020d = qVar;
                qVar.b(eVar);
                v vVar = new v(assets, str, flutterCallbackInformationLookupCallbackInformation);
                if (bVar.f46279g) {
                    Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
                    return;
                }
                gj.a.b("DartExecutor#executeDartCallback");
                try {
                    Objects.toString(vVar);
                    bVar.f46274b.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformationLookupCallbackInformation.callbackName, flutterCallbackInformationLookupCallbackInformation.callbackLibraryPath, assets, null, bVar.f46276d);
                    bVar.f46279g = true;
                    Trace.endSection();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a(SessionCaptureStrategy sessionCaptureStrategy, Function2 function2, long j10, ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.f25981d = sessionCaptureStrategy;
        this.f25982e = function2;
        this.f25980c = j10;
        this.f25983f = screenshotRecorderConfig;
    }
}
