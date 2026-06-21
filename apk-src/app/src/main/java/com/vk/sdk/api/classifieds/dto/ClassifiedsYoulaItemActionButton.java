package com.vk.sdk.api.classifieds.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class ClassifiedsYoulaItemActionButton {

    @b("type")
    @NotNull
    private final Type type;

    @b("url")
    @Nullable
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        MENU_EDIT("menu_edit"),
        MENU_SUPPORT("menu_support"),
        MENU_DELETE("menu_delete"),
        MENU_SHARE("menu_share"),
        BTN_MAIN("btn_main"),
        BTN_CREATE("btn_create"),
        BTN_DELETE("btn_delete"),
        BTN_SUPPORT("btn_support"),
        BTN_EDIT("btn_edit"),
        BTN_REPUBLISH("btn_republish"),
        BTN_PROMOTION("btn_promotion"),
        BTN_CROSSPOSTING("btn_crossposting"),
        BTN_STOP_PUBLISH("btn_stop_publish");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public ClassifiedsYoulaItemActionButton(@NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.url = str;
    }

    public static /* synthetic */ ClassifiedsYoulaItemActionButton copy$default(ClassifiedsYoulaItemActionButton classifiedsYoulaItemActionButton, Type type, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type = classifiedsYoulaItemActionButton.type;
        }
        if ((i & 2) != 0) {
            str = classifiedsYoulaItemActionButton.url;
        }
        return classifiedsYoulaItemActionButton.copy(type, str);
    }

    @NotNull
    public final Type component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final ClassifiedsYoulaItemActionButton copy(@NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ClassifiedsYoulaItemActionButton(type, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemActionButton)) {
            return false;
        }
        ClassifiedsYoulaItemActionButton classifiedsYoulaItemActionButton = (ClassifiedsYoulaItemActionButton) obj;
        return this.type == classifiedsYoulaItemActionButton.type && Intrinsics.a(this.url, classifiedsYoulaItemActionButton.url);
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ClassifiedsYoulaItemActionButton(type=" + this.type + ", url=" + this.url + ")";
    }

    public /* synthetic */ ClassifiedsYoulaItemActionButton(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : str);
    }
}
