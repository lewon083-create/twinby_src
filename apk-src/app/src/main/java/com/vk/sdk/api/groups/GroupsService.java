package com.vk.sdk.api.groups;

import com.appsflyer.AdRevenueScheme;
import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.addresses.dto.AddressesFields;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.groups.dto.GroupsAddAddressWorkInfoStatus;
import com.vk.sdk.api.groups.dto.GroupsAddCallbackServerResponse;
import com.vk.sdk.api.groups.dto.GroupsAddress;
import com.vk.sdk.api.groups.dto.GroupsCallbackSettings;
import com.vk.sdk.api.groups.dto.GroupsCreateSubtype;
import com.vk.sdk.api.groups.dto.GroupsCreateType;
import com.vk.sdk.api.groups.dto.GroupsEditAddressWorkInfoStatus;
import com.vk.sdk.api.groups.dto.GroupsEditAgeLimits;
import com.vk.sdk.api.groups.dto.GroupsFields;
import com.vk.sdk.api.groups.dto.GroupsFilter;
import com.vk.sdk.api.groups.dto.GroupsGetAddressesResponse;
import com.vk.sdk.api.groups.dto.GroupsGetBannedResponse;
import com.vk.sdk.api.groups.dto.GroupsGetCallbackConfirmationCodeResponse;
import com.vk.sdk.api.groups.dto.GroupsGetCallbackServersResponse;
import com.vk.sdk.api.groups.dto.GroupsGetCatalogInfoExtendedResponse;
import com.vk.sdk.api.groups.dto.GroupsGetCatalogInfoResponse;
import com.vk.sdk.api.groups.dto.GroupsGetCatalogResponse;
import com.vk.sdk.api.groups.dto.GroupsGetInvitedUsersNameCase;
import com.vk.sdk.api.groups.dto.GroupsGetInvitedUsersResponse;
import com.vk.sdk.api.groups.dto.GroupsGetInvitesExtendedResponse;
import com.vk.sdk.api.groups.dto.GroupsGetInvitesResponse;
import com.vk.sdk.api.groups.dto.GroupsGetMembersFieldsResponse;
import com.vk.sdk.api.groups.dto.GroupsGetMembersFilter;
import com.vk.sdk.api.groups.dto.GroupsGetMembersSort;
import com.vk.sdk.api.groups.dto.GroupsGetObjectExtendedResponse;
import com.vk.sdk.api.groups.dto.GroupsGetRequestsFieldsResponse;
import com.vk.sdk.api.groups.dto.GroupsGetResponse;
import com.vk.sdk.api.groups.dto.GroupsGetSettingsResponse;
import com.vk.sdk.api.groups.dto.GroupsGetTokenPermissionsResponse;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.groups.dto.GroupsGroupTag;
import com.vk.sdk.api.groups.dto.GroupsLinksItem;
import com.vk.sdk.api.groups.dto.GroupsLongPollServer;
import com.vk.sdk.api.groups.dto.GroupsLongPollSettings;
import com.vk.sdk.api.groups.dto.GroupsSearchResponse;
import com.vk.sdk.api.groups.dto.GroupsSearchSort;
import com.vk.sdk.api.groups.dto.GroupsSearchType;
import com.vk.sdk.api.groups.dto.GroupsTagAddTagColor;
import com.vk.sdk.api.groups.dto.GroupsTagBindAct;
import com.vk.sdk.api.groups.dto.GroupsToggleMarketState;
import com.vk.sdk.api.users.dto.UsersFields;
import io.sentry.SentryLockReason;
import io.sentry.TraceContext;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.Geo;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wf.b;

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
public final class GroupsService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsAddAddress$lambda-0, reason: not valid java name */
    public static final GroupsAddress m210groupsAddAddress$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsAddress) GsonHolder.INSTANCE.getGson().b(it, GroupsAddress.class);
    }

    public static /* synthetic */ VKRequest groupsAddCallbackServer$default(GroupsService groupsService, UserId userId, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return groupsService.groupsAddCallbackServer(userId, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsAddCallbackServer$lambda-8, reason: not valid java name */
    public static final GroupsAddCallbackServerResponse m211groupsAddCallbackServer$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsAddCallbackServerResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsAddCallbackServerResponse.class);
    }

    public static /* synthetic */ VKRequest groupsAddLink$default(GroupsService groupsService, UserId userId, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return groupsService.groupsAddLink(userId, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsAddLink$lambda-11, reason: not valid java name */
    public static final GroupsLinksItem m212groupsAddLink$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsLinksItem) GsonHolder.INSTANCE.getGson().b(it, GroupsLinksItem.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsApproveRequest$lambda-14, reason: not valid java name */
    public static final BaseOkResponse m213groupsApproveRequest$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsBan$default(GroupsService groupsService, UserId userId, UserId userId2, Integer num, Integer num2, String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            userId2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return groupsService.groupsBan(userId, userId2, num, num2, str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsBan$lambda-16, reason: not valid java name */
    public static final BaseOkResponse m214groupsBan$lambda16(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsCreate$default(GroupsService groupsService, String str, String str2, GroupsCreateType groupsCreateType, Integer num, Integer num2, GroupsCreateSubtype groupsCreateSubtype, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            groupsCreateType = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            groupsCreateSubtype = null;
        }
        return groupsService.groupsCreate(str, str2, groupsCreateType, num, num2, groupsCreateSubtype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsCreate$lambda-23, reason: not valid java name */
    public static final GroupsGroup m215groupsCreate$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGroup) GsonHolder.INSTANCE.getGson().b(it, GroupsGroup.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsDeleteAddress$lambda-30, reason: not valid java name */
    public static final BaseOkResponse m216groupsDeleteAddress$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsDeleteCallbackServer$lambda-32, reason: not valid java name */
    public static final BaseOkResponse m217groupsDeleteCallbackServer$lambda32(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsDeleteLink$lambda-34, reason: not valid java name */
    public static final BaseOkResponse m218groupsDeleteLink$lambda34(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsDisableOnline$lambda-36, reason: not valid java name */
    public static final BaseOkResponse m219groupsDisableOnline$lambda36(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsEdit$default(GroupsService groupsService, UserId userId, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, Integer num2, Integer num3, UserId userId2, Integer num4, Integer num5, String str9, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num11, Integer num12, Boolean bool5, Boolean bool6, Boolean bool7, GroupsEditAgeLimits groupsEditAgeLimits, Boolean bool8, Boolean bool9, List list, List list2, Integer num13, Integer num14, Integer num15, Boolean bool10, Boolean bool11, List list3, Integer num16, Integer num17, Integer num18, Integer num19, int i, int i10, Object obj) {
        Integer num20;
        Boolean bool12;
        Boolean bool13;
        List list4;
        Integer num21;
        Integer num22;
        String str10;
        Integer num23;
        String str11;
        Integer num24;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Integer num25;
        Integer num26;
        UserId userId3;
        Integer num27;
        String str17;
        Integer num28;
        Integer num29;
        Integer num30;
        Integer num31;
        Integer num32;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Integer num33;
        Integer num34;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        GroupsEditAgeLimits groupsEditAgeLimits2;
        Boolean bool21;
        List list5;
        List list6;
        Integer num35;
        Integer num36;
        Integer num37;
        Boolean bool22;
        GroupsService groupsService2;
        UserId userId4;
        Integer num38;
        String str18;
        String str19 = (i & 2) != 0 ? null : str;
        String str20 = (i & 4) != 0 ? null : str2;
        String str21 = (i & 8) != 0 ? null : str3;
        Integer num39 = (i & 16) != 0 ? null : num;
        String str22 = (i & 32) != 0 ? null : str4;
        String str23 = (i & 64) != 0 ? null : str5;
        String str24 = (i & 128) != 0 ? null : str6;
        String str25 = (i & 256) != 0 ? null : str7;
        String str26 = (i & 512) != 0 ? null : str8;
        Integer num40 = (i & 1024) != 0 ? null : num2;
        Integer num41 = (i & 2048) != 0 ? null : num3;
        UserId userId5 = (i & 4096) != 0 ? null : userId2;
        Integer num42 = (i & 8192) != 0 ? null : num4;
        Integer num43 = (i & 16384) != 0 ? null : num5;
        String str27 = (i & 32768) != 0 ? null : str9;
        Integer num44 = (i & 65536) != 0 ? null : num6;
        Integer num45 = (i & 131072) != 0 ? null : num7;
        Integer num46 = (i & 262144) != 0 ? null : num8;
        Integer num47 = (i & 524288) != 0 ? null : num9;
        Integer num48 = (i & 1048576) != 0 ? null : num10;
        Boolean bool23 = (i & 2097152) != 0 ? null : bool;
        Boolean bool24 = (i & 4194304) != 0 ? null : bool2;
        Boolean bool25 = (i & 8388608) != 0 ? null : bool3;
        Boolean bool26 = (i & 16777216) != 0 ? null : bool4;
        Integer num49 = (i & 33554432) != 0 ? null : num11;
        Integer num50 = (i & 67108864) != 0 ? null : num12;
        Boolean bool27 = (i & 134217728) != 0 ? null : bool5;
        Boolean bool28 = (i & 268435456) != 0 ? null : bool6;
        Boolean bool29 = (i & 536870912) != 0 ? null : bool7;
        GroupsEditAgeLimits groupsEditAgeLimits3 = (i & 1073741824) != 0 ? null : groupsEditAgeLimits;
        Boolean bool30 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : bool8;
        Boolean bool31 = (i10 & 1) != 0 ? null : bool9;
        List list7 = (i10 & 2) != 0 ? null : list;
        List list8 = (i10 & 4) != 0 ? null : list2;
        Integer num51 = (i10 & 8) != 0 ? null : num13;
        Integer num52 = (i10 & 16) != 0 ? null : num14;
        Integer num53 = (i10 & 32) != 0 ? null : num15;
        Boolean bool32 = (i10 & 64) != 0 ? null : bool10;
        Boolean bool33 = bool30;
        Boolean bool34 = (i10 & 128) != 0 ? null : bool11;
        List list9 = (i10 & 256) != 0 ? null : list3;
        Integer num54 = (i10 & 512) != 0 ? null : num16;
        Integer num55 = (i10 & 1024) != 0 ? null : num17;
        Integer num56 = (i10 & 2048) != 0 ? null : num18;
        if ((i10 & 4096) != 0) {
            num20 = null;
            bool12 = bool33;
            bool13 = bool34;
            list4 = list9;
            num21 = num54;
            num38 = num55;
            num22 = num56;
            str10 = str19;
            num23 = num43;
            str11 = str20;
            str18 = str21;
            num24 = num39;
            str12 = str22;
            str13 = str23;
            str14 = str24;
            str15 = str25;
            str16 = str26;
            num25 = num40;
            num26 = num41;
            userId3 = userId5;
            num27 = num42;
            str17 = str27;
            num28 = num44;
            num29 = num45;
            num30 = num46;
            num31 = num47;
            num32 = num48;
            bool14 = bool23;
            bool15 = bool24;
            bool16 = bool25;
            bool17 = bool26;
            num33 = num49;
            num34 = num50;
            bool18 = bool27;
            bool19 = bool28;
            bool20 = bool29;
            groupsEditAgeLimits2 = groupsEditAgeLimits3;
            bool21 = bool31;
            list5 = list7;
            list6 = list8;
            num35 = num51;
            num36 = num52;
            num37 = num53;
            bool22 = bool32;
            groupsService2 = groupsService;
            userId4 = userId;
        } else {
            num20 = num19;
            bool12 = bool33;
            bool13 = bool34;
            list4 = list9;
            num21 = num54;
            num22 = num56;
            str10 = str19;
            num23 = num43;
            str11 = str20;
            num24 = num39;
            str12 = str22;
            str13 = str23;
            str14 = str24;
            str15 = str25;
            str16 = str26;
            num25 = num40;
            num26 = num41;
            userId3 = userId5;
            num27 = num42;
            str17 = str27;
            num28 = num44;
            num29 = num45;
            num30 = num46;
            num31 = num47;
            num32 = num48;
            bool14 = bool23;
            bool15 = bool24;
            bool16 = bool25;
            bool17 = bool26;
            num33 = num49;
            num34 = num50;
            bool18 = bool27;
            bool19 = bool28;
            bool20 = bool29;
            groupsEditAgeLimits2 = groupsEditAgeLimits3;
            bool21 = bool31;
            list5 = list7;
            list6 = list8;
            num35 = num51;
            num36 = num52;
            num37 = num53;
            bool22 = bool32;
            groupsService2 = groupsService;
            userId4 = userId;
            num38 = num55;
            str18 = str21;
        }
        return groupsService2.groupsEdit(userId4, str10, str11, str18, num24, str12, str13, str14, str15, str16, num25, num26, userId3, num27, num23, str17, num28, num29, num30, num31, num32, bool14, bool15, bool16, bool17, num33, num34, bool18, bool19, bool20, groupsEditAgeLimits2, bool12, bool21, list5, list6, num35, num36, num37, bool22, bool13, list4, num21, num38, num22, num20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsEdit$lambda-38, reason: not valid java name */
    public static final BaseOkResponse m220groupsEdit$lambda38(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsEditAddress$lambda-84, reason: not valid java name */
    public static final GroupsAddress m221groupsEditAddress$lambda84(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsAddress) GsonHolder.INSTANCE.getGson().b(it, GroupsAddress.class);
    }

    public static /* synthetic */ VKRequest groupsEditCallbackServer$default(GroupsService groupsService, UserId userId, int i, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        return groupsService.groupsEditCallbackServer(userId, i, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsEditCallbackServer$lambda-98, reason: not valid java name */
    public static final BaseOkResponse m222groupsEditCallbackServer$lambda98(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsEditLink$default(GroupsService groupsService, UserId userId, int i, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return groupsService.groupsEditLink(userId, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsEditLink$lambda-101, reason: not valid java name */
    public static final BaseOkResponse m223groupsEditLink$lambda101(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsEditManager$default(GroupsService groupsService, UserId userId, UserId userId2, String str, Boolean bool, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return groupsService.groupsEditManager(userId, userId2, str, bool, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsEditManager$lambda-104, reason: not valid java name */
    public static final BaseOkResponse m224groupsEditManager$lambda104(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsEnableOnline$lambda-111, reason: not valid java name */
    public static final BaseOkResponse m225groupsEnableOnline$lambda111(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGet$default(GroupsService groupsService, UserId userId, List list, List list2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        return groupsService.groupsGet(userId, list, list2, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGet$lambda-113, reason: not valid java name */
    public static final GroupsGetResponse m226groupsGet$lambda113(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetAddresses$default(GroupsService groupsService, UserId userId, List list, Float f10, Float f11, Integer num, Integer num2, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            f10 = null;
        }
        if ((i & 8) != 0) {
            f11 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            list2 = null;
        }
        return groupsService.groupsGetAddresses(userId, list, f10, f11, num, num2, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetAddresses$lambda-131, reason: not valid java name */
    public static final GroupsGetAddressesResponse m227groupsGetAddresses$lambda131(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetAddressesResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetAddressesResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetBanned$default(GroupsService groupsService, UserId userId, Integer num, Integer num2, List list, UserId userId2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            userId2 = null;
        }
        return groupsService.groupsGetBanned(userId, num, num2, list, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetBanned$lambda-140, reason: not valid java name */
    public static final GroupsGetBannedResponse m228groupsGetBanned$lambda140(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetBannedResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetBannedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetById$default(GroupsService groupsService, List list, UserId userId, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return groupsService.groupsGetById(list, userId, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetById$lambda-147, reason: not valid java name */
    public static final List m229groupsGetById$lambda147(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends GroupsGroupFull>>() { // from class: com.vk.sdk.api.groups.GroupsService$groupsGetById$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetCallbackConfirmationCode$lambda-153, reason: not valid java name */
    public static final GroupsGetCallbackConfirmationCodeResponse m230groupsGetCallbackConfirmationCode$lambda153(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetCallbackConfirmationCodeResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetCallbackConfirmationCodeResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetCallbackServers$default(GroupsService groupsService, UserId userId, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return groupsService.groupsGetCallbackServers(userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetCallbackServers$lambda-155, reason: not valid java name */
    public static final GroupsGetCallbackServersResponse m231groupsGetCallbackServers$lambda155(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetCallbackServersResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetCallbackServersResponse.class);
    }

    public static /* synthetic */ VKRequest groupsGetCallbackSettings$default(GroupsService groupsService, UserId userId, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return groupsService.groupsGetCallbackSettings(userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetCallbackSettings$lambda-158, reason: not valid java name */
    public static final GroupsCallbackSettings m232groupsGetCallbackSettings$lambda158(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsCallbackSettings) GsonHolder.INSTANCE.getGson().b(it, GroupsCallbackSettings.class);
    }

    public static /* synthetic */ VKRequest groupsGetCatalog$default(GroupsService groupsService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return groupsService.groupsGetCatalog(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetCatalog$lambda-161, reason: not valid java name */
    public static final GroupsGetCatalogResponse m233groupsGetCatalog$lambda161(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetCatalogResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetCatalogResponse.class);
    }

    public static /* synthetic */ VKRequest groupsGetCatalogInfo$default(GroupsService groupsService, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return groupsService.groupsGetCatalogInfo(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetCatalogInfo$lambda-165, reason: not valid java name */
    public static final GroupsGetCatalogInfoResponse m234groupsGetCatalogInfo$lambda165(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetCatalogInfoResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetCatalogInfoResponse.class);
    }

    public static /* synthetic */ VKRequest groupsGetCatalogInfoExtended$default(GroupsService groupsService, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return groupsService.groupsGetCatalogInfoExtended(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetCatalogInfoExtended$lambda-168, reason: not valid java name */
    public static final GroupsGetCatalogInfoExtendedResponse m235groupsGetCatalogInfoExtended$lambda168(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetCatalogInfoExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetCatalogInfoExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetExtended$default(GroupsService groupsService, UserId userId, List list, List list2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        return groupsService.groupsGetExtended(userId, list, list2, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetExtended$lambda-122, reason: not valid java name */
    public static final GroupsGetObjectExtendedResponse m236groupsGetExtended$lambda122(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetObjectExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetObjectExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetInvitedUsers$default(GroupsService groupsService, UserId userId, Integer num, Integer num2, List list, GroupsGetInvitedUsersNameCase groupsGetInvitedUsersNameCase, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            groupsGetInvitedUsersNameCase = null;
        }
        return groupsService.groupsGetInvitedUsers(userId, num, num2, list, groupsGetInvitedUsersNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetInvitedUsers$lambda-171, reason: not valid java name */
    public static final GroupsGetInvitedUsersResponse m237groupsGetInvitedUsers$lambda171(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetInvitedUsersResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetInvitedUsersResponse.class);
    }

    public static /* synthetic */ VKRequest groupsGetInvites$default(GroupsService groupsService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return groupsService.groupsGetInvites(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetInvites$lambda-178, reason: not valid java name */
    public static final GroupsGetInvitesResponse m238groupsGetInvites$lambda178(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetInvitesResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetInvitesResponse.class);
    }

    public static /* synthetic */ VKRequest groupsGetInvitesExtended$default(GroupsService groupsService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return groupsService.groupsGetInvitesExtended(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetInvitesExtended$lambda-182, reason: not valid java name */
    public static final GroupsGetInvitesExtendedResponse m239groupsGetInvitesExtended$lambda182(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetInvitesExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetInvitesExtendedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetLongPollServer$lambda-186, reason: not valid java name */
    public static final GroupsLongPollServer m240groupsGetLongPollServer$lambda186(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsLongPollServer) GsonHolder.INSTANCE.getGson().b(it, GroupsLongPollServer.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetLongPollSettings$lambda-188, reason: not valid java name */
    public static final GroupsLongPollSettings m241groupsGetLongPollSettings$lambda188(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsLongPollSettings) GsonHolder.INSTANCE.getGson().b(it, GroupsLongPollSettings.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetMembers$default(GroupsService groupsService, String str, GroupsGetMembersSort groupsGetMembersSort, Integer num, Integer num2, List list, GroupsGetMembersFilter groupsGetMembersFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            groupsGetMembersSort = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            groupsGetMembersFilter = null;
        }
        return groupsService.groupsGetMembers(str, groupsGetMembersSort, num, num2, list, groupsGetMembersFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetMembers$lambda-190, reason: not valid java name */
    public static final GroupsGetMembersFieldsResponse m242groupsGetMembers$lambda190(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetMembersFieldsResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetMembersFieldsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetOnlineStatus$lambda-199, reason: not valid java name */
    public static final Unit m243groupsGetOnlineStatus$lambda199(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsGetRequests$default(GroupsService groupsService, UserId userId, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return groupsService.groupsGetRequests(userId, num, num2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetRequests$lambda-201, reason: not valid java name */
    public static final GroupsGetRequestsFieldsResponse m244groupsGetRequests$lambda201(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetRequestsFieldsResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetRequestsFieldsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetSettings$lambda-207, reason: not valid java name */
    public static final GroupsGetSettingsResponse m245groupsGetSettings$lambda207(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsGetSettingsResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsGetSettingsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetTagList$lambda-209, reason: not valid java name */
    public static final List m246groupsGetTagList$lambda209(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends GroupsGroupTag>>() { // from class: com.vk.sdk.api.groups.GroupsService$groupsGetTagList$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsGetTokenPermissions$lambda-211, reason: not valid java name */
    public static final GroupsGetTokenPermissionsResponse m247groupsGetTokenPermissions$lambda211(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, GroupsGetTokenPermissionsResponse.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…ionsResponse::class.java)");
        return (GroupsGetTokenPermissionsResponse) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsInvite$lambda-212, reason: not valid java name */
    public static final BaseOkResponse m248groupsInvite$lambda212(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest groupsIsMember$default(GroupsService groupsService, String str, UserId userId, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return groupsService.groupsIsMember(str, userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsIsMember$lambda-214, reason: not valid java name */
    public static final BaseBoolInt m249groupsIsMember$lambda214(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest groupsJoin$default(GroupsService groupsService, UserId userId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return groupsService.groupsJoin(userId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsJoin$lambda-218, reason: not valid java name */
    public static final BaseOkResponse m250groupsJoin$lambda218(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsLeave$lambda-222, reason: not valid java name */
    public static final BaseOkResponse m251groupsLeave$lambda222(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsRemoveUser$lambda-224, reason: not valid java name */
    public static final BaseOkResponse m252groupsRemoveUser$lambda224(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsReorderLink$default(GroupsService groupsService, UserId userId, int i, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return groupsService.groupsReorderLink(userId, i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsReorderLink$lambda-226, reason: not valid java name */
    public static final BaseOkResponse m253groupsReorderLink$lambda226(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsSearch$default(GroupsService groupsService, String str, GroupsSearchType groupsSearchType, Integer num, Integer num2, Boolean bool, Boolean bool2, GroupsSearchSort groupsSearchSort, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 2) != 0) {
            groupsSearchType = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            groupsSearchSort = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            num4 = null;
        }
        return groupsService.groupsSearch(str, groupsSearchType, num, num2, bool, bool2, groupsSearchSort, num3, num4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsSearch$lambda-229, reason: not valid java name */
    public static final GroupsSearchResponse m254groupsSearch$lambda229(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GroupsSearchResponse) GsonHolder.INSTANCE.getGson().b(it, GroupsSearchResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsSetCallbackSettings$lambda-239, reason: not valid java name */
    public static final BaseOkResponse m255groupsSetCallbackSettings$lambda239(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsSetLongPollSettings$lambda-295, reason: not valid java name */
    public static final BaseOkResponse m256groupsSetLongPollSettings$lambda295(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsSetSettings$default(GroupsService groupsService, UserId userId, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 16) != 0) {
            bool4 = null;
        }
        return groupsService.groupsSetSettings(userId, bool, bool2, bool3, bool4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsSetSettings$lambda-348, reason: not valid java name */
    public static final BaseOkResponse m257groupsSetSettings$lambda348(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsSetUserNote$default(GroupsService groupsService, UserId userId, UserId userId2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return groupsService.groupsSetUserNote(userId, userId2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsSetUserNote$lambda-354, reason: not valid java name */
    public static final BaseBoolInt m258groupsSetUserNote$lambda354(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest groupsTagAdd$default(GroupsService groupsService, UserId userId, String str, GroupsTagAddTagColor groupsTagAddTagColor, int i, Object obj) {
        if ((i & 4) != 0) {
            groupsTagAddTagColor = null;
        }
        return groupsService.groupsTagAdd(userId, str, groupsTagAddTagColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsTagAdd$lambda-357, reason: not valid java name */
    public static final BaseBoolInt m259groupsTagAdd$lambda357(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsTagBind$lambda-360, reason: not valid java name */
    public static final BaseBoolInt m260groupsTagBind$lambda360(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsTagDelete$lambda-362, reason: not valid java name */
    public static final BaseBoolInt m261groupsTagDelete$lambda362(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsTagUpdate$lambda-364, reason: not valid java name */
    public static final BaseBoolInt m262groupsTagUpdate$lambda364(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest groupsToggleMarket$default(GroupsService groupsService, UserId userId, GroupsToggleMarketState groupsToggleMarketState, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return groupsService.groupsToggleMarket(userId, groupsToggleMarketState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsToggleMarket$lambda-366, reason: not valid java name */
    public static final BaseOkResponse m263groupsToggleMarket$lambda366(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest groupsUnban$default(GroupsService groupsService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return groupsService.groupsUnban(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: groupsUnban$lambda-369, reason: not valid java name */
    public static final BaseOkResponse m264groupsUnban$lambda369(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<GroupsAddress> groupsAddAddress(@NotNull UserId groupId, @NotNull String title, @NotNull String address, int i, int i10, float f10, float f11, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable GroupsAddAddressWorkInfoStatus groupsAddAddressWorkInfoStatus, @Nullable String str3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        NewApiRequest newApiRequest = new NewApiRequest("groups.addAddress", new wf.a(19));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, SentryLockReason.JsonKeys.ADDRESS, address, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "country_id", i, 1, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "city_id", i10, 1, 0, 8, (Object) null);
        newApiRequest.addParam("latitude", f10, -90.0d, 90.0d);
        newApiRequest.addParam("longitude", f11, -180.0d, 180.0d);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "additional_address", str, 0, 400, 4, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "metro_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("phone", str2);
        }
        if (groupsAddAddressWorkInfoStatus != null) {
            newApiRequest.addParam("work_info_status", groupsAddAddressWorkInfoStatus.getValue());
        }
        if (str3 != null) {
            newApiRequest.addParam("timetable", str3);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_main_address", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsAddCallbackServerResponse> groupsAddCallbackServer(@NotNull UserId groupId, @NotNull String url, @NotNull String title, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("groups.addCallbackServer", new wf.a(28));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("url", url);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 14, 4, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "secret_key", str, 0, 50, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsLinksItem> groupsAddLink(@NotNull UserId groupId, @NotNull String link, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(link, "link");
        NewApiRequest newApiRequest = new NewApiRequest("groups.addLink", new wf.a(4));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("link", link);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("text", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsApproveRequest(@NotNull UserId groupId, @NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.approveRequest", new wf.a(23));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsBan(@NotNull UserId groupId, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.ban", new b(6));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_date", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, DiscardedEvent.JsonKeys.REASON, num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("comment", str);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("comment_visible", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGroup> groupsCreate(@NotNull String title, @Nullable String str, @Nullable GroupsCreateType groupsCreateType, @Nullable Integer num, @Nullable Integer num2, @Nullable GroupsCreateSubtype groupsCreateSubtype) {
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("groups.create", new vg.a(24));
        newApiRequest.addParam("title", title);
        if (str != null) {
            newApiRequest.addParam("description", str);
        }
        if (groupsCreateType != null) {
            newApiRequest.addParam("type", groupsCreateType.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "public_category", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "public_subcategory", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (groupsCreateSubtype == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("subtype", groupsCreateSubtype.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsDeleteAddress(@NotNull UserId groupId, int i) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.deleteAddress", new wf.a(5));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "address_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsDeleteCallbackServer(@NotNull UserId groupId, int i) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.deleteCallbackServer", new wf.a(14));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "server_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsDeleteLink(@NotNull UserId groupId, int i) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.deleteLink", new vg.a(17));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "link_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsDisableOnline(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.disableOnline", new wf.a(7));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsEdit(@NotNull UserId groupId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num2, @Nullable Integer num3, @Nullable UserId userId, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str9, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num11, @Nullable Integer num12, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable GroupsEditAgeLimits groupsEditAgeLimits, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable List<String> list3, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.edit", new wf.a(24));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("title", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("description", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("screen_name", str3);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "access", num.intValue(), 0, 0, 8, (Object) null);
            Unit unit = Unit.f27471a;
        }
        if (str4 != null) {
            newApiRequest.addParam("website", str4);
        }
        if (str5 != null) {
            newApiRequest.addParam("subject", str5);
        }
        if (str6 != null) {
            newApiRequest.addParam("email", str6);
        }
        if (str7 != null) {
            newApiRequest.addParam("phone", str7);
        }
        if (str8 != null) {
            newApiRequest.addParam("rss", str8);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "event_start_date", num2.intValue(), 0, 0, 8, (Object) null);
            Unit unit2 = Unit.f27471a;
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "event_finish_date", num3.intValue(), 0, 0, 8, (Object) null);
            Unit unit3 = Unit.f27471a;
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "event_group_id", userId, 0L, 0L, 8, (Object) null);
            Unit unit4 = Unit.f27471a;
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "public_category", num4.intValue(), 0, 0, 8, (Object) null);
            Unit unit5 = Unit.f27471a;
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "public_subcategory", num5.intValue(), 0, 0, 8, (Object) null);
            Unit unit6 = Unit.f27471a;
        }
        if (str9 != null) {
            newApiRequest.addParam("public_date", str9);
        }
        if (num6 != null) {
            NewApiRequest.addParam$default(newApiRequest, "wall", num6.intValue(), 0, 0, 8, (Object) null);
            Unit unit7 = Unit.f27471a;
        }
        if (num7 != null) {
            NewApiRequest.addParam$default(newApiRequest, "topics", num7.intValue(), 0, 0, 8, (Object) null);
            Unit unit8 = Unit.f27471a;
        }
        if (num8 != null) {
            NewApiRequest.addParam$default(newApiRequest, "photos", num8.intValue(), 0, 0, 8, (Object) null);
            Unit unit9 = Unit.f27471a;
        }
        if (num9 != null) {
            NewApiRequest.addParam$default(newApiRequest, RRWebVideoEvent.EVENT_TAG, num9.intValue(), 0, 0, 8, (Object) null);
            Unit unit10 = Unit.f27471a;
        }
        if (num10 != null) {
            NewApiRequest.addParam$default(newApiRequest, "audio", num10.intValue(), 0, 0, 8, (Object) null);
            Unit unit11 = Unit.f27471a;
        }
        if (bool != null) {
            newApiRequest.addParam("links", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("events", bool2.booleanValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("places", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("contacts", bool4.booleanValue());
        }
        if (num11 != null) {
            NewApiRequest.addParam$default(newApiRequest, "docs", num11.intValue(), 0, 0, 8, (Object) null);
            Unit unit12 = Unit.f27471a;
        }
        if (num12 != null) {
            NewApiRequest.addParam$default(newApiRequest, "wiki", num12.intValue(), 0, 0, 8, (Object) null);
            Unit unit13 = Unit.f27471a;
        }
        if (bool5 != null) {
            newApiRequest.addParam("messages", bool5.booleanValue());
        }
        if (bool6 != null) {
            newApiRequest.addParam("articles", bool6.booleanValue());
        }
        if (bool7 != null) {
            newApiRequest.addParam("addresses", bool7.booleanValue());
        }
        if (groupsEditAgeLimits != null) {
            newApiRequest.addParam("age_limits", groupsEditAgeLimits.getValue());
        }
        if (bool8 != null) {
            newApiRequest.addParam("market", bool8.booleanValue());
        }
        if (bool9 != null) {
            newApiRequest.addParam("market_comments", bool9.booleanValue());
        }
        if (list != null) {
            newApiRequest.addParam("market_country", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("market_city", list2);
        }
        if (num13 != null) {
            NewApiRequest.addParam$default(newApiRequest, "market_currency", num13.intValue(), 0, 0, 8, (Object) null);
            Unit unit14 = Unit.f27471a;
        }
        if (num14 != null) {
            NewApiRequest.addParam$default(newApiRequest, "market_contact", num14.intValue(), 0, 0, 8, (Object) null);
            Unit unit15 = Unit.f27471a;
        }
        if (num15 != null) {
            NewApiRequest.addParam$default(newApiRequest, "market_wiki", num15.intValue(), 0, 0, 8, (Object) null);
            Unit unit16 = Unit.f27471a;
        }
        if (bool10 != null) {
            newApiRequest.addParam("obscene_filter", bool10.booleanValue());
        }
        if (bool11 != null) {
            newApiRequest.addParam("obscene_stopwords", bool11.booleanValue());
        }
        if (list3 != null) {
            newApiRequest.addParam("obscene_words", list3);
        }
        if (num16 != null) {
            NewApiRequest.addParam$default(newApiRequest, "main_section", num16.intValue(), 0, 0, 8, (Object) null);
            Unit unit17 = Unit.f27471a;
        }
        if (num17 != null) {
            NewApiRequest.addParam$default(newApiRequest, "secondary_section", num17.intValue(), 0, 0, 8, (Object) null);
            Unit unit18 = Unit.f27471a;
        }
        if (num18 != null) {
            NewApiRequest.addParam$default(newApiRequest, AdRevenueScheme.COUNTRY, num18.intValue(), 0, 0, 8, (Object) null);
            Unit unit19 = Unit.f27471a;
        }
        if (num19 != null) {
            NewApiRequest.addParam$default(newApiRequest, Geo.JsonKeys.CITY, num19.intValue(), 0, 0, 8, (Object) null);
            Unit unit20 = Unit.f27471a;
        }
        Unit unit21 = Unit.f27471a;
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsAddress> groupsEditAddress(@NotNull UserId groupId, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f10, @Nullable Float f11, @Nullable String str4, @Nullable GroupsEditAddressWorkInfoStatus groupsEditAddressWorkInfoStatus, @Nullable String str5, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.editAddress", new wf.a(3));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "address_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "title", str, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, SentryLockReason.JsonKeys.ADDRESS, str2, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "additional_address", str3, 0, 400, 4, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "country_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "city_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "metro_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue(), -90.0d, 90.0d);
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue(), -180.0d, 180.0d);
        }
        if (str4 != null) {
            newApiRequest.addParam("phone", str4);
        }
        if (groupsEditAddressWorkInfoStatus != null) {
            newApiRequest.addParam("work_info_status", groupsEditAddressWorkInfoStatus.getValue());
        }
        if (str5 != null) {
            newApiRequest.addParam("timetable", str5);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_main_address", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsEditCallbackServer(@NotNull UserId groupId, int i, @NotNull String url, @NotNull String title, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("groups.editCallbackServer", new vg.a(27));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "server_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("url", url);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 14, 4, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "secret_key", str, 0, 50, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsEditLink(@NotNull UserId groupId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.editLink", new wf.a(12));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "link_id", i, 0, 0, 8, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("text", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsEditManager(@NotNull UserId groupId, @NotNull UserId userId, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.editManager", new wf.a(22));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("role", str);
        }
        if (bool != null) {
            newApiRequest.addParam("is_contact", bool.booleanValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("contact_position", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("contact_phone", str3);
        }
        if (str4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(Feedback.JsonKeys.CONTACT_EMAIL, str4);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsEnableOnline(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.enableOnline", new wf.a(18));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetResponse> groupsGet(@Nullable UserId userId, @Nullable List<? extends GroupsFilter> list, @Nullable List<? extends GroupsFields> list2, @Nullable Integer num, @Nullable Integer num2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("groups.get", new b(9));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        }
        ArrayList arrayList2 = null;
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends GroupsFilter> list3 = list;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFilter) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filter", (Iterable<?>) arrayList);
        }
        if (list2 != null) {
            List<? extends GroupsFields> list4 = list2;
            arrayList2 = new ArrayList(t.j(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GroupsFields) it2.next()).getValue());
            }
        }
        if (arrayList2 != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList2);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetAddressesResponse> groupsGetAddresses(@NotNull UserId groupId, @Nullable List<Integer> list, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends AddressesFields> list2) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getAddresses", new wf.a(27));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (list != null) {
            newApiRequest.addParam("address_ids", list);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue(), -90.0d, 90.0d);
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue(), -180.0d, 180.0d);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (list2 == null) {
            arrayList = null;
        } else {
            List<? extends AddressesFields> list3 = list2;
            ArrayList arrayList2 = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AddressesFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetBannedResponse> groupsGetBanned(@NotNull UserId groupId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends BaseUserGroupFields> list, @Nullable UserId userId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getBanned", new vg.a(28));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<GroupsGroupFull>> groupsGetById(@Nullable List<UserId> list, @Nullable UserId userId, @Nullable List<? extends GroupsFields> list2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("groups.getById", new wf.a(11));
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_ids", list, 0L, 0L, 12, (Object) null);
        }
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (list2 == null) {
            arrayList = null;
        } else {
            List<? extends GroupsFields> list3 = list2;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetCallbackConfirmationCodeResponse> groupsGetCallbackConfirmationCode(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getCallbackConfirmationCode", new wf.a(10));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetCallbackServersResponse> groupsGetCallbackServers(@NotNull UserId groupId, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getCallbackServers", new wf.a(25));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("server_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsCallbackSettings> groupsGetCallbackSettings(@NotNull UserId groupId, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getCallbackSettings", new wf.a(13));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "server_id", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetCatalogResponse> groupsGetCatalog(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("groups.getCatalog", new wf.a(15));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "category_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("subcategory_id", num2.intValue(), 0, 99);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetCatalogInfoResponse> groupsGetCatalogInfo(@Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("groups.getCatalogInfo", new wf.a(16));
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("subcategories", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetCatalogInfoExtendedResponse> groupsGetCatalogInfoExtended(@Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("groups.getCatalogInfo", new wf.a(0));
        newApiRequest.addParam("extended", true);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("subcategories", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetObjectExtendedResponse> groupsGetExtended(@Nullable UserId userId, @Nullable List<? extends GroupsFilter> list, @Nullable List<? extends GroupsFields> list2, @Nullable Integer num, @Nullable Integer num2) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("groups.get", new vg.a(29));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        ArrayList arrayList2 = null;
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends GroupsFilter> list3 = list;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFilter) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filter", (Iterable<?>) arrayList);
        }
        if (list2 != null) {
            List<? extends GroupsFields> list4 = list2;
            arrayList2 = new ArrayList(t.j(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GroupsFields) it2.next()).getValue());
            }
        }
        if (arrayList2 != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList2);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetInvitedUsersResponse> groupsGetInvitedUsers(@NotNull UserId groupId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list, @Nullable GroupsGetInvitedUsersNameCase groupsGetInvitedUsersNameCase) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getInvitedUsers", new wf.a(1));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (groupsGetInvitedUsersNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", groupsGetInvitedUsersNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetInvitesResponse> groupsGetInvites(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("groups.getInvites", new vg.a(23));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetInvitesExtendedResponse> groupsGetInvitesExtended(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("groups.getInvites", new b(1));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsLongPollServer> groupsGetLongPollServer(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getLongPollServer", new wf.a(29));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsLongPollSettings> groupsGetLongPollSettings(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getLongPollSettings", new b(8));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetMembersFieldsResponse> groupsGetMembers(@Nullable String str, @Nullable GroupsGetMembersSort groupsGetMembersSort, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list, @Nullable GroupsGetMembersFilter groupsGetMembersFilter) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("groups.getMembers", new wf.a(8));
        if (str != null) {
            newApiRequest.addParam("group_id", str);
        }
        if (groupsGetMembersSort != null) {
            newApiRequest.addParam("sort", groupsGetMembersSort.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (groupsGetMembersFilter == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("filter", groupsGetMembersFilter.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> groupsGetOnlineStatus(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getOnlineStatus", new vg.a(20));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetRequestsFieldsResponse> groupsGetRequests(@NotNull UserId groupId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getRequests", new vg.a(22));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetSettingsResponse> groupsGetSettings(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getSettings", new b(0));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<GroupsGroupTag>> groupsGetTagList(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.getTagList", new vg.a(21));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsGetTokenPermissionsResponse> groupsGetTokenPermissions() {
        return new NewApiRequest("groups.getTokenPermissions", new wf.a(20));
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsInvite(@NotNull UserId groupId, @NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.invite", new b(3));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> groupsIsMember(@NotNull String groupId, @Nullable UserId userId, @Nullable List<UserId> list) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.isMember", new wf.a(9));
        newApiRequest.addParam("group_id", groupId);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (list == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "user_ids", list, 0L, 0L, 12, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsJoin(@Nullable UserId userId, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("groups.join", new vg.a(26));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 1L, 0L, 8, (Object) null);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("not_sure", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsLeave(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.leave", new b(7));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsRemoveUser(@NotNull UserId groupId, @NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.removeUser", new b(5));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsReorderLink(@NotNull UserId groupId, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.reorderLink", new wf.a(26));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "link_id", i, 0, 0, 8, (Object) null);
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "after", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<GroupsSearchResponse> groupsSearch(@NotNull String q2, @Nullable GroupsSearchType groupsSearchType, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable GroupsSearchSort groupsSearchSort, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(q2, "q");
        NewApiRequest newApiRequest = new NewApiRequest("groups.search", new wf.a(21));
        newApiRequest.addParam("q", q2);
        if (groupsSearchType != null) {
            newApiRequest.addParam("type", groupsSearchType.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "country_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "city_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("future", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("market", bool2.booleanValue());
        }
        if (groupsSearchSort != null) {
            newApiRequest.addParam("sort", groupsSearchSort.getValue());
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num4.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsSetCallbackSettings(@NotNull UserId groupId, @Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable Boolean bool12, @Nullable Boolean bool13, @Nullable Boolean bool14, @Nullable Boolean bool15, @Nullable Boolean bool16, @Nullable Boolean bool17, @Nullable Boolean bool18, @Nullable Boolean bool19, @Nullable Boolean bool20, @Nullable Boolean bool21, @Nullable Boolean bool22, @Nullable Boolean bool23, @Nullable Boolean bool24, @Nullable Boolean bool25, @Nullable Boolean bool26, @Nullable Boolean bool27, @Nullable Boolean bool28, @Nullable Boolean bool29, @Nullable Boolean bool30, @Nullable Boolean bool31, @Nullable Boolean bool32, @Nullable Boolean bool33, @Nullable Boolean bool34, @Nullable Boolean bool35, @Nullable Boolean bool36, @Nullable Boolean bool37, @Nullable Boolean bool38, @Nullable Boolean bool39, @Nullable Boolean bool40, @Nullable Boolean bool41, @Nullable Boolean bool42, @Nullable Boolean bool43, @Nullable Boolean bool44, @Nullable Boolean bool45, @Nullable Boolean bool46, @Nullable Boolean bool47, @Nullable Boolean bool48, @Nullable Boolean bool49, @Nullable Boolean bool50, @Nullable Boolean bool51, @Nullable Boolean bool52) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.setCallbackSettings", new vg.a(25));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "server_id", num.intValue(), 0, 0, 8, (Object) null);
            Unit unit = Unit.f27471a;
        }
        if (str != null) {
            newApiRequest.addParam("api_version", str);
        }
        if (bool != null) {
            newApiRequest.addParam("message_new", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("message_reply", bool2.booleanValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("message_allow", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("message_edit", bool4.booleanValue());
        }
        if (bool5 != null) {
            newApiRequest.addParam("message_deny", bool5.booleanValue());
        }
        if (bool6 != null) {
            newApiRequest.addParam("message_typing_state", bool6.booleanValue());
        }
        if (bool7 != null) {
            newApiRequest.addParam("photo_new", bool7.booleanValue());
        }
        if (bool8 != null) {
            newApiRequest.addParam("audio_new", bool8.booleanValue());
        }
        if (bool9 != null) {
            newApiRequest.addParam("video_new", bool9.booleanValue());
        }
        if (bool10 != null) {
            newApiRequest.addParam("wall_reply_new", bool10.booleanValue());
        }
        if (bool11 != null) {
            newApiRequest.addParam("wall_reply_edit", bool11.booleanValue());
        }
        if (bool12 != null) {
            newApiRequest.addParam("wall_reply_delete", bool12.booleanValue());
        }
        if (bool13 != null) {
            newApiRequest.addParam("wall_reply_restore", bool13.booleanValue());
        }
        if (bool14 != null) {
            newApiRequest.addParam("wall_post_new", bool14.booleanValue());
        }
        if (bool15 != null) {
            newApiRequest.addParam("wall_repost", bool15.booleanValue());
        }
        if (bool16 != null) {
            newApiRequest.addParam("board_post_new", bool16.booleanValue());
        }
        if (bool17 != null) {
            newApiRequest.addParam("board_post_edit", bool17.booleanValue());
        }
        if (bool18 != null) {
            newApiRequest.addParam("board_post_restore", bool18.booleanValue());
        }
        if (bool19 != null) {
            newApiRequest.addParam("board_post_delete", bool19.booleanValue());
        }
        if (bool20 != null) {
            newApiRequest.addParam("photo_comment_new", bool20.booleanValue());
        }
        if (bool21 != null) {
            newApiRequest.addParam("photo_comment_edit", bool21.booleanValue());
        }
        if (bool22 != null) {
            newApiRequest.addParam("photo_comment_delete", bool22.booleanValue());
        }
        if (bool23 != null) {
            newApiRequest.addParam("photo_comment_restore", bool23.booleanValue());
        }
        if (bool24 != null) {
            newApiRequest.addParam("video_comment_new", bool24.booleanValue());
        }
        if (bool25 != null) {
            newApiRequest.addParam("video_comment_edit", bool25.booleanValue());
        }
        if (bool26 != null) {
            newApiRequest.addParam("video_comment_delete", bool26.booleanValue());
        }
        if (bool27 != null) {
            newApiRequest.addParam("video_comment_restore", bool27.booleanValue());
        }
        if (bool28 != null) {
            newApiRequest.addParam("market_comment_new", bool28.booleanValue());
        }
        if (bool29 != null) {
            newApiRequest.addParam("market_comment_edit", bool29.booleanValue());
        }
        if (bool30 != null) {
            newApiRequest.addParam("market_comment_delete", bool30.booleanValue());
        }
        if (bool31 != null) {
            newApiRequest.addParam("market_comment_restore", bool31.booleanValue());
        }
        if (bool32 != null) {
            newApiRequest.addParam("market_order_new", bool32.booleanValue());
        }
        if (bool33 != null) {
            newApiRequest.addParam("market_order_edit", bool33.booleanValue());
        }
        if (bool34 != null) {
            newApiRequest.addParam("poll_vote_new", bool34.booleanValue());
        }
        if (bool35 != null) {
            newApiRequest.addParam("group_join", bool35.booleanValue());
        }
        if (bool36 != null) {
            newApiRequest.addParam("group_leave", bool36.booleanValue());
        }
        if (bool37 != null) {
            newApiRequest.addParam("group_change_settings", bool37.booleanValue());
        }
        if (bool38 != null) {
            newApiRequest.addParam("group_change_photo", bool38.booleanValue());
        }
        if (bool39 != null) {
            newApiRequest.addParam("group_officers_edit", bool39.booleanValue());
        }
        if (bool40 != null) {
            newApiRequest.addParam("user_block", bool40.booleanValue());
        }
        if (bool41 != null) {
            newApiRequest.addParam("user_unblock", bool41.booleanValue());
        }
        if (bool42 != null) {
            newApiRequest.addParam("lead_forms_new", bool42.booleanValue());
        }
        if (bool43 != null) {
            newApiRequest.addParam("like_add", bool43.booleanValue());
        }
        if (bool44 != null) {
            newApiRequest.addParam("like_remove", bool44.booleanValue());
        }
        if (bool45 != null) {
            newApiRequest.addParam("message_event", bool45.booleanValue());
        }
        if (bool46 != null) {
            newApiRequest.addParam("donut_subscription_create", bool46.booleanValue());
        }
        if (bool47 != null) {
            newApiRequest.addParam("donut_subscription_prolonged", bool47.booleanValue());
        }
        if (bool48 != null) {
            newApiRequest.addParam("donut_subscription_cancelled", bool48.booleanValue());
        }
        if (bool49 != null) {
            newApiRequest.addParam("donut_subscription_price_changed", bool49.booleanValue());
        }
        if (bool50 != null) {
            newApiRequest.addParam("donut_subscription_expired", bool50.booleanValue());
        }
        if (bool51 != null) {
            newApiRequest.addParam("donut_money_withdraw", bool51.booleanValue());
        }
        if (bool52 != null) {
            newApiRequest.addParam("donut_money_withdraw_error", bool52.booleanValue());
            Unit unit2 = Unit.f27471a;
        }
        Unit unit3 = Unit.f27471a;
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsSetLongPollSettings(@NotNull UserId groupId, @Nullable Boolean bool, @Nullable String str, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable Boolean bool12, @Nullable Boolean bool13, @Nullable Boolean bool14, @Nullable Boolean bool15, @Nullable Boolean bool16, @Nullable Boolean bool17, @Nullable Boolean bool18, @Nullable Boolean bool19, @Nullable Boolean bool20, @Nullable Boolean bool21, @Nullable Boolean bool22, @Nullable Boolean bool23, @Nullable Boolean bool24, @Nullable Boolean bool25, @Nullable Boolean bool26, @Nullable Boolean bool27, @Nullable Boolean bool28, @Nullable Boolean bool29, @Nullable Boolean bool30, @Nullable Boolean bool31, @Nullable Boolean bool32, @Nullable Boolean bool33, @Nullable Boolean bool34, @Nullable Boolean bool35, @Nullable Boolean bool36, @Nullable Boolean bool37, @Nullable Boolean bool38, @Nullable Boolean bool39, @Nullable Boolean bool40, @Nullable Boolean bool41, @Nullable Boolean bool42, @Nullable Boolean bool43, @Nullable Boolean bool44, @Nullable Boolean bool45, @Nullable Boolean bool46, @Nullable Boolean bool47, @Nullable Boolean bool48, @Nullable Boolean bool49, @Nullable Boolean bool50) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.setLongPollSettings", new vg.a(15));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("enabled", bool.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("api_version", str);
        }
        if (bool2 != null) {
            newApiRequest.addParam("message_new", bool2.booleanValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("message_reply", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("message_allow", bool4.booleanValue());
        }
        if (bool5 != null) {
            newApiRequest.addParam("message_deny", bool5.booleanValue());
        }
        if (bool6 != null) {
            newApiRequest.addParam("message_edit", bool6.booleanValue());
        }
        if (bool7 != null) {
            newApiRequest.addParam("message_typing_state", bool7.booleanValue());
        }
        if (bool8 != null) {
            newApiRequest.addParam("photo_new", bool8.booleanValue());
        }
        if (bool9 != null) {
            newApiRequest.addParam("audio_new", bool9.booleanValue());
        }
        if (bool10 != null) {
            newApiRequest.addParam("video_new", bool10.booleanValue());
        }
        if (bool11 != null) {
            newApiRequest.addParam("wall_reply_new", bool11.booleanValue());
        }
        if (bool12 != null) {
            newApiRequest.addParam("wall_reply_edit", bool12.booleanValue());
        }
        if (bool13 != null) {
            newApiRequest.addParam("wall_reply_delete", bool13.booleanValue());
        }
        if (bool14 != null) {
            newApiRequest.addParam("wall_reply_restore", bool14.booleanValue());
        }
        if (bool15 != null) {
            newApiRequest.addParam("wall_post_new", bool15.booleanValue());
        }
        if (bool16 != null) {
            newApiRequest.addParam("wall_repost", bool16.booleanValue());
        }
        if (bool17 != null) {
            newApiRequest.addParam("board_post_new", bool17.booleanValue());
        }
        if (bool18 != null) {
            newApiRequest.addParam("board_post_edit", bool18.booleanValue());
        }
        if (bool19 != null) {
            newApiRequest.addParam("board_post_restore", bool19.booleanValue());
        }
        if (bool20 != null) {
            newApiRequest.addParam("board_post_delete", bool20.booleanValue());
        }
        if (bool21 != null) {
            newApiRequest.addParam("photo_comment_new", bool21.booleanValue());
        }
        if (bool22 != null) {
            newApiRequest.addParam("photo_comment_edit", bool22.booleanValue());
        }
        if (bool23 != null) {
            newApiRequest.addParam("photo_comment_delete", bool23.booleanValue());
        }
        if (bool24 != null) {
            newApiRequest.addParam("photo_comment_restore", bool24.booleanValue());
        }
        if (bool25 != null) {
            newApiRequest.addParam("video_comment_new", bool25.booleanValue());
        }
        if (bool26 != null) {
            newApiRequest.addParam("video_comment_edit", bool26.booleanValue());
        }
        if (bool27 != null) {
            newApiRequest.addParam("video_comment_delete", bool27.booleanValue());
        }
        if (bool28 != null) {
            newApiRequest.addParam("video_comment_restore", bool28.booleanValue());
        }
        if (bool29 != null) {
            newApiRequest.addParam("market_comment_new", bool29.booleanValue());
        }
        if (bool30 != null) {
            newApiRequest.addParam("market_comment_edit", bool30.booleanValue());
        }
        if (bool31 != null) {
            newApiRequest.addParam("market_comment_delete", bool31.booleanValue());
        }
        if (bool32 != null) {
            newApiRequest.addParam("market_comment_restore", bool32.booleanValue());
        }
        if (bool33 != null) {
            newApiRequest.addParam("poll_vote_new", bool33.booleanValue());
        }
        if (bool34 != null) {
            newApiRequest.addParam("group_join", bool34.booleanValue());
        }
        if (bool35 != null) {
            newApiRequest.addParam("group_leave", bool35.booleanValue());
        }
        if (bool36 != null) {
            newApiRequest.addParam("group_change_settings", bool36.booleanValue());
        }
        if (bool37 != null) {
            newApiRequest.addParam("group_change_photo", bool37.booleanValue());
        }
        if (bool38 != null) {
            newApiRequest.addParam("group_officers_edit", bool38.booleanValue());
        }
        if (bool39 != null) {
            newApiRequest.addParam("user_block", bool39.booleanValue());
        }
        if (bool40 != null) {
            newApiRequest.addParam("user_unblock", bool40.booleanValue());
        }
        if (bool41 != null) {
            newApiRequest.addParam("like_add", bool41.booleanValue());
        }
        if (bool42 != null) {
            newApiRequest.addParam("like_remove", bool42.booleanValue());
        }
        if (bool43 != null) {
            newApiRequest.addParam("message_event", bool43.booleanValue());
        }
        if (bool44 != null) {
            newApiRequest.addParam("donut_subscription_create", bool44.booleanValue());
        }
        if (bool45 != null) {
            newApiRequest.addParam("donut_subscription_prolonged", bool45.booleanValue());
        }
        if (bool46 != null) {
            newApiRequest.addParam("donut_subscription_cancelled", bool46.booleanValue());
        }
        if (bool47 != null) {
            newApiRequest.addParam("donut_subscription_price_changed", bool47.booleanValue());
        }
        if (bool48 != null) {
            newApiRequest.addParam("donut_subscription_expired", bool48.booleanValue());
        }
        if (bool49 != null) {
            newApiRequest.addParam("donut_money_withdraw", bool49.booleanValue());
        }
        if (bool50 != null) {
            newApiRequest.addParam("donut_money_withdraw_error", bool50.booleanValue());
            Unit unit = Unit.f27471a;
        }
        Unit unit2 = Unit.f27471a;
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsSetSettings(@NotNull UserId groupId, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.setSettings", new wf.a(17));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("messages", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("bots_capabilities", bool2.booleanValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("bots_start_button", bool3.booleanValue());
        }
        if (bool4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("bots_add_to_chat", bool4.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> groupsSetUserNote(@NotNull UserId groupId, @NotNull UserId userId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.setUserNote", new vg.a(16));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "note", str, 0, 96, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> groupsTagAdd(@NotNull UserId groupId, @NotNull String tagName, @Nullable GroupsTagAddTagColor groupsTagAddTagColor) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NewApiRequest newApiRequest = new NewApiRequest("groups.tagAdd", new vg.a(18));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "tag_name", tagName, 0, 20, 4, (Object) null);
        if (groupsTagAddTagColor == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("tag_color", groupsTagAddTagColor.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> groupsTagBind(@NotNull UserId groupId, int i, @NotNull UserId userId, @NotNull GroupsTagBindAct act) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(act, "act");
        NewApiRequest newApiRequest = new NewApiRequest("groups.tagBind", new b(4));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "tag_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId, 1L, 2000000000L);
        newApiRequest.addParam("act", act.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> groupsTagDelete(@NotNull UserId groupId, int i) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.tagDelete", new wf.a(2));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "tag_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> groupsTagUpdate(@NotNull UserId groupId, int i, @NotNull String tagName) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NewApiRequest newApiRequest = new NewApiRequest("groups.tagUpdate", new b(2));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "tag_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "tag_name", tagName, 0, 20, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsToggleMarket(@NotNull UserId groupId, @NotNull GroupsToggleMarketState state, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(state, "state");
        NewApiRequest newApiRequest = new NewApiRequest("groups.toggleMarket", new vg.a(19));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam(SentryThread.JsonKeys.STATE, state.getValue());
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("ref", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> groupsUnban(@NotNull UserId groupId, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("groups.unban", new wf.a(6));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }
}
