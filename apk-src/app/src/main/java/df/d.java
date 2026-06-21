package df;

import android.media.AudioManager;
import com.appsflyer.AppsFlyerProperties;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class d implements ei.b, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f15787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioManager f15788c;

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Object systemService = binding.f16381a.getSystemService("audio");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f15788c = (AudioManager) systemService;
        q qVar = new q(binding.f16383c, "com.twinby.audio_focus");
        this.f15787b = qVar;
        qVar.b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f15787b;
        if (qVar != null) {
            qVar.b(null);
        } else {
            Intrinsics.g(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    @Override // ii.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.f21315a;
        if (str.equals("requestFocus")) {
            AudioManager audioManager = this.f15788c;
            if (audioManager != null) {
                ((hi.g) result).success(Boolean.valueOf(audioManager.requestAudioFocus(null, 3, 1) == 1));
                return;
            } else {
                Intrinsics.g("audioManager");
                throw null;
            }
        }
        if (!str.equals("abandonFocus")) {
            ((hi.g) result).a();
            return;
        }
        AudioManager audioManager2 = this.f15788c;
        if (audioManager2 == null) {
            Intrinsics.g("audioManager");
            throw null;
        }
        audioManager2.abandonAudioFocus(null);
        ((hi.g) result).success(Boolean.TRUE);
    }
}
