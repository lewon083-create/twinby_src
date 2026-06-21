package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.vk.api.sdk.R;
import com.vk.api.sdk.VKScheduler;
import com.vk.api.sdk.utils.VKValidationLocker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKConfirmationActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_MESSAGE = "key_message";
    private static boolean result;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: start$lambda-0, reason: not valid java name */
        public static final void m32start$lambda0(Context context, String message) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(message, "$message");
            Intent intentPutExtra = new Intent(context, (Class<?>) VKConfirmationActivity.class).addFlags(268435456).putExtra(VKConfirmationActivity.KEY_MESSAGE, message);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(context, VKConfir…tra(KEY_MESSAGE, message)");
            context.startActivity(intentPutExtra);
        }

        public final boolean getResult() {
            return VKConfirmationActivity.result;
        }

        public final void setResult(boolean z5) {
            VKConfirmationActivity.result = z5;
        }

        public final void start(Context context, String message) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            VKScheduler.runOnMainThread$default(new c(context, message, 1), 0L, 2, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m29onCreate$lambda0(VKConfirmationActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        result = true;
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m30onCreate$lambda1(VKConfirmationActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        result = false;
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m31onCreate$lambda2(VKConfirmationActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        result = false;
        this$0.finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        VKValidationLocker.INSTANCE.signal();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        final int i = 0;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this, 5).setTitle(R.string.vk_confirm).setMessage(getIntent().getStringExtra(KEY_MESSAGE)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: com.vk.api.sdk.ui.d

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKConfirmationActivity f15105c;

            {
                this.f15105c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                switch (i) {
                    case 0:
                        VKConfirmationActivity.m29onCreate$lambda0(this.f15105c, dialogInterface, i10);
                        break;
                    default:
                        VKConfirmationActivity.m30onCreate$lambda1(this.f15105c, dialogInterface, i10);
                        break;
                }
            }
        });
        final int i10 = 1;
        positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: com.vk.api.sdk.ui.d

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKConfirmationActivity f15105c;

            {
                this.f15105c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i102) {
                switch (i10) {
                    case 0:
                        VKConfirmationActivity.m29onCreate$lambda0(this.f15105c, dialogInterface, i102);
                        break;
                    default:
                        VKConfirmationActivity.m30onCreate$lambda1(this.f15105c, dialogInterface, i102);
                        break;
                }
            }
        }).setOnCancelListener(new b(this, 1)).show();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        VKValidationLocker.INSTANCE.signal();
    }
}
