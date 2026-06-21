package df;

import android.app.Activity;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.h3;
import z2.w;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class c implements ei.b, fi.a, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f15786b;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f15786b = (w) ((h3) binding).f28250b;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        new q(binding.f16383c, "advertising_id").b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // ii.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        final Activity activity = this.f15786b;
        if (activity == null) {
            ((hi.g) result).b("noActivity", "Activity is null", null);
            return;
        }
        String str = call.f21315a;
        if (str.equals("getAdvertisingId")) {
            final hi.g gVar = (hi.g) result;
            final int i = 0;
            rl.b.u(new Function0() { // from class: df.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            Activity activity2 = activity;
                            final hi.g gVar2 = gVar;
                            try {
                                activity2.runOnUiThread(new a0.d(22, gVar2, AdvertisingIdClient.getAdvertisingIdInfo(activity2).getId()));
                            } catch (Exception e3) {
                                final int i10 = 1;
                                activity2.runOnUiThread(new Runnable() { // from class: df.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                Exception exc = e3;
                                                gVar2.b(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e3;
                                                gVar2.b(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            Activity activity3 = activity;
                            final hi.g gVar3 = gVar;
                            try {
                                activity3.runOnUiThread(new a1.b(2, gVar3, AdvertisingIdClient.getAdvertisingIdInfo(activity3).isLimitAdTrackingEnabled()));
                            } catch (Exception e7) {
                                final int i11 = 0;
                                activity3.runOnUiThread(new Runnable() { // from class: df.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                Exception exc = e7;
                                                gVar3.b(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e7;
                                                gVar3.b(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                    return Unit.f27471a;
                }
            });
        } else if (!str.equals("isLimitAdTrackingEnabled")) {
            ((hi.g) result).a();
            Unit unit = Unit.f27471a;
        } else {
            final hi.g gVar2 = (hi.g) result;
            final int i10 = 1;
            rl.b.u(new Function0() { // from class: df.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            Activity activity2 = activity;
                            final hi.g gVar22 = gVar2;
                            try {
                                activity2.runOnUiThread(new a0.d(22, gVar22, AdvertisingIdClient.getAdvertisingIdInfo(activity2).getId()));
                            } catch (Exception e3) {
                                final int i102 = 1;
                                activity2.runOnUiThread(new Runnable() { // from class: df.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i102) {
                                            case 0:
                                                Exception exc = e3;
                                                gVar22.b(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e3;
                                                gVar22.b(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            Activity activity3 = activity;
                            final hi.g gVar3 = gVar2;
                            try {
                                activity3.runOnUiThread(new a1.b(2, gVar3, AdvertisingIdClient.getAdvertisingIdInfo(activity3).isLimitAdTrackingEnabled()));
                            } catch (Exception e7) {
                                final int i11 = 0;
                                activity3.runOnUiThread(new Runnable() { // from class: df.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                Exception exc = e7;
                                                gVar3.b(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e7;
                                                gVar3.b(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                    return Unit.f27471a;
                }
            });
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
    }
}
