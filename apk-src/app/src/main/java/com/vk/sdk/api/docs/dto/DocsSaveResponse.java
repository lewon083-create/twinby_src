package com.vk.sdk.api.docs.dto;

import com.vk.sdk.api.messages.dto.MessagesAudioMessage;
import com.vk.sdk.api.messages.dto.MessagesGraffiti;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DocsSaveResponse {

    @b("audio_message")
    @Nullable
    private final MessagesAudioMessage audioMessage;

    @b("doc")
    @Nullable
    private final DocsDoc doc;

    @b("graffiti")
    @Nullable
    private final MessagesGraffiti graffiti;

    @b("type")
    @Nullable
    private final DocsDocAttachmentType type;

    public DocsSaveResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DocsSaveResponse copy$default(DocsSaveResponse docsSaveResponse, DocsDocAttachmentType docsDocAttachmentType, MessagesAudioMessage messagesAudioMessage, DocsDoc docsDoc, MessagesGraffiti messagesGraffiti, int i, Object obj) {
        if ((i & 1) != 0) {
            docsDocAttachmentType = docsSaveResponse.type;
        }
        if ((i & 2) != 0) {
            messagesAudioMessage = docsSaveResponse.audioMessage;
        }
        if ((i & 4) != 0) {
            docsDoc = docsSaveResponse.doc;
        }
        if ((i & 8) != 0) {
            messagesGraffiti = docsSaveResponse.graffiti;
        }
        return docsSaveResponse.copy(docsDocAttachmentType, messagesAudioMessage, docsDoc, messagesGraffiti);
    }

    @Nullable
    public final DocsDocAttachmentType component1() {
        return this.type;
    }

    @Nullable
    public final MessagesAudioMessage component2() {
        return this.audioMessage;
    }

    @Nullable
    public final DocsDoc component3() {
        return this.doc;
    }

    @Nullable
    public final MessagesGraffiti component4() {
        return this.graffiti;
    }

    @NotNull
    public final DocsSaveResponse copy(@Nullable DocsDocAttachmentType docsDocAttachmentType, @Nullable MessagesAudioMessage messagesAudioMessage, @Nullable DocsDoc docsDoc, @Nullable MessagesGraffiti messagesGraffiti) {
        return new DocsSaveResponse(docsDocAttachmentType, messagesAudioMessage, docsDoc, messagesGraffiti);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsSaveResponse)) {
            return false;
        }
        DocsSaveResponse docsSaveResponse = (DocsSaveResponse) obj;
        return this.type == docsSaveResponse.type && Intrinsics.a(this.audioMessage, docsSaveResponse.audioMessage) && Intrinsics.a(this.doc, docsSaveResponse.doc) && Intrinsics.a(this.graffiti, docsSaveResponse.graffiti);
    }

    @Nullable
    public final MessagesAudioMessage getAudioMessage() {
        return this.audioMessage;
    }

    @Nullable
    public final DocsDoc getDoc() {
        return this.doc;
    }

    @Nullable
    public final MessagesGraffiti getGraffiti() {
        return this.graffiti;
    }

    @Nullable
    public final DocsDocAttachmentType getType() {
        return this.type;
    }

    public int hashCode() {
        DocsDocAttachmentType docsDocAttachmentType = this.type;
        int iHashCode = (docsDocAttachmentType == null ? 0 : docsDocAttachmentType.hashCode()) * 31;
        MessagesAudioMessage messagesAudioMessage = this.audioMessage;
        int iHashCode2 = (iHashCode + (messagesAudioMessage == null ? 0 : messagesAudioMessage.hashCode())) * 31;
        DocsDoc docsDoc = this.doc;
        int iHashCode3 = (iHashCode2 + (docsDoc == null ? 0 : docsDoc.hashCode())) * 31;
        MessagesGraffiti messagesGraffiti = this.graffiti;
        return iHashCode3 + (messagesGraffiti != null ? messagesGraffiti.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DocsSaveResponse(type=" + this.type + ", audioMessage=" + this.audioMessage + ", doc=" + this.doc + ", graffiti=" + this.graffiti + ")";
    }

    public DocsSaveResponse(@Nullable DocsDocAttachmentType docsDocAttachmentType, @Nullable MessagesAudioMessage messagesAudioMessage, @Nullable DocsDoc docsDoc, @Nullable MessagesGraffiti messagesGraffiti) {
        this.type = docsDocAttachmentType;
        this.audioMessage = messagesAudioMessage;
        this.doc = docsDoc;
        this.graffiti = messagesGraffiti;
    }

    public /* synthetic */ DocsSaveResponse(DocsDocAttachmentType docsDocAttachmentType, MessagesAudioMessage messagesAudioMessage, DocsDoc docsDoc, MessagesGraffiti messagesGraffiti, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : docsDocAttachmentType, (i & 2) != 0 ? null : messagesAudioMessage, (i & 4) != 0 ? null : docsDoc, (i & 8) != 0 ? null : messagesGraffiti);
    }
}
