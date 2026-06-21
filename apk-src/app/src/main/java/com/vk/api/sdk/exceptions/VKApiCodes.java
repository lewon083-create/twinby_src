package com.vk.api.sdk.exceptions;

import kotlin.Metadata;

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
public final class VKApiCodes {
    public static final int CODE_ACCESS_DENIED = 15;
    public static final int CODE_ACCESS_DENIED_TO_ALBUM = 200;
    public static final int CODE_ACCESS_DENIED_TO_AUDIO = 201;
    public static final int CODE_ACCESS_DENIED_TO_GROUP = 203;
    public static final int CODE_ACCESS_POLLS_WITHOUT_VOTE = 253;
    public static final int CODE_ACCOUNT_INVALID_SCREEN_NAME = 1260;
    public static final int CODE_ADD_CHAT_MEMBER_ACCESS_TO_GROUP_DENIED = 947;
    public static final int CODE_ADVERTISE_CABINET_ERROR = 603;
    public static final int CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION = 600;
    public static final int CODE_ANONYM_TOKEN_EXPIRED = 1114;
    public static final int CODE_ANONYM_TOKEN_INVALID = 1116;
    public static final int CODE_APP_DISABLED = 2;
    public static final int CODE_APP_MUST_BE_TURNED_OFF_WHILE_TESTING = 11;
    public static final int CODE_AUTHORIZATION_FAILED = 5;
    public static final int CODE_CALL_HAS_BEEN_FINISHED = 951;
    public static final int CODE_CALL_INVALID_SECRET = 952;
    public static final int CODE_CALL_LINK_OUTDATED = 961;
    public static final int CODE_CALL_REQUIRES_AUTH = 960;
    public static final int CODE_CAPTCHA_REQUIRED = 14;
    public static final int CODE_CHAT_ACCESS_DENIED = 917;
    public static final int CODE_CHAT_ALREADY_IN_ARCHIVE = 964;
    public static final int CODE_CHAT_INVITE_MAKE_LINK_DENIED = 919;
    public static final int CODE_CHAT_MR_ALREADY_SEND = 939;
    public static final int CODE_CHAT_NOT_ADMIN = 925;
    public static final int CODE_CHAT_NOT_IN_ARCHIVE = 965;
    public static final int CODE_CLEAR_CACHE_REQUESTED = 907;
    public static final int CODE_CLEAR_CACHE_REQUESTED2 = 908;
    public static final int CODE_CLIENT_UPDATE_NEEDED = 35;
    public static final int CODE_CLIENT_VERSION_DEPRECATED = 34;
    public static final int CODE_COMMUNITY_NOT_FOUND = 4519;
    public static final int CODE_COMPOSITE_EXECUTE_ERROR = Integer.MIN_VALUE;
    public static final int CODE_CONTENT_BLOCKED = 19;
    public static final int CODE_ERROR_ALREADY_HAS_EXTERNAL_BINDING = 3612;
    public static final int CODE_ERROR_APPS_MENU_TOO_MANY_APPS = 1259;
    public static final int CODE_ERROR_CANNOT_TRANSFER_MONEY_YOURSELF = 5800;
    public static final int CODE_ERROR_LIMITS = 103;
    public static final int CODE_ERROR_MARKET_COMMENTS_CLOSED = 1401;
    public static final int CODE_ERROR_MARKET_ITEM_NOT_FOUND = 1403;
    public static final int CODE_ERROR_NEED_TOKEN_EXTENSION = 3609;
    public static final int CODE_ERROR_UNAVAILABLE_REGISTRATION = 5400;
    public static final int CODE_ERROR_UPLOAD_PHOTO_DECODE_FAILED = 4600;
    public static final int CODE_ERROR_UPLOAD_PHOTO_PREPROCESS_FAILED = 4602;
    public static final int CODE_ERROR_UPLOAD_PHOTO_WRONG_IMAGE_SIZE = 4601;
    public static final int CODE_ERROR_USER_DEACTIVATED = 3610;
    public static final int CODE_ERROR_VIDEO_COMMENTS_CLOSED = 801;
    public static final int CODE_ERROR_WALL_ACCESS_REPLIES = 212;
    public static final int CODE_HTTPS_REQUIRED = 16;
    public static final int CODE_IGNORED_ACCESS_TOKEN = -2;
    public static final int CODE_INTERNAL_EXECUTE_ERROR = 13;
    public static final int CODE_INTERNAL_SERVER_ERROR = 10;
    public static final int CODE_INVALID_APP_IDENTIFIER = 101;
    public static final int CODE_INVALID_AUDIO_TRANSCRIPTION = 959;
    public static final int CODE_INVALID_NAME = 953;
    public static final int CODE_INVALID_PHOTO_FORMAT = 129;
    public static final int CODE_INVALID_PHOTO_ID = 4520;
    public static final int CODE_INVALID_PHOTO_UPLOAD = 22;
    public static final int CODE_INVALID_REQUEST = 8;
    public static final int CODE_INVALID_SID = 1113;
    public static final int CODE_INVALID_SIGNATURE = 4;
    public static final int CODE_INVALID_TIMESTAMP = 150;
    public static final int CODE_INVALID_USER_IDENTIFIER = 113;
    public static final int CODE_INVITE_LINK_AVAILABLE_FOR_CLOSED_GROUPS = 713;
    public static final int CODE_INVITE_LINK_EXPIRED = 714;
    public static final int CODE_IO_ERROR = -1;
    public static final int CODE_METHOD_NOT_SUPPORTED = 23;
    public static final int CODE_MSG_DELETE_FOR_ALL_FAILED = 924;
    public static final int CODE_MSG_SEND_FAIL_TO_RESEND_FWDS = 921;
    public static final int CODE_MSG_SEND_MSG_TOO_LONG = 914;
    public static final int CODE_MSG_SEND_NO_ACCESS_TO_CHAT = 917;
    public static final int CODE_MSG_SEND_RECIPIENT_BLACKLISTED = 900;
    public static final int CODE_MSG_SEND_RECIPIENT_FORBID_GROUPS_MSGS = 901;
    public static final int CODE_MSG_SEND_TO_MANY_FWDS = 913;
    public static final int CODE_MSG_SEND_VIOLATION_OF_PRIVACY_SETTINGS = 902;
    public static final int CODE_NOT_FOUND = 104;
    public static final int CODE_NO_PERMISSIONS = 7;
    public static final int CODE_OPERATION_AVAILABLE_ONLY_FOR_STANDALONE_AND_OPEN_API_APPS = 21;
    public static final int CODE_OPERATION_DENIED_FOR_NON_STANDALONE_APP = 20;
    public static final int CODE_OPERATION_NOT_PERMITTED = 500;
    public static final int CODE_PHONE_ALREADY_USED = 1004;
    public static final int CODE_PHONE_AUTH_DELAY = 1112;
    public static final int CODE_PHONE_PARAM_PHONE = 1000;
    public static final int CODE_PHOTO_ACCESS_ERROR = 4525;
    public static final int CODE_PHOTO_ALBUM_LIMIT_EXCEED = 300;
    public static final int CODE_PRIVATE_PROFILE = 30;
    public static final int CODE_PRODUCT_DUPLICATE_ERROR = 4527;
    public static final int CODE_RATE_LIMIT_REACHED = 29;
    public static final int CODE_REQUIRED_ARG_NOT_FOUND = 100;
    public static final int CODE_SIGN_UP_CODE_INCORRECT = 1110;
    public static final int CODE_SIGN_UP_PASSWORD_UNALLOWABLE = 1111;
    public static final int CODE_STICKERS_DISABLED = 1191;
    public static final int CODE_SUPER_APP_TOKEN_INVALID = 1115;
    public static final int CODE_TEXT_LIVE_EMPTY_MESSAGE = 2600;
    public static final int CODE_TEXT_LIVE_FINISHED = 2603;
    public static final int CODE_TEXT_LIVE_LARGE_MESSAGE = 2606;
    public static final int CODE_TEXT_LIVE_MORE_ONE_ATTACH = 2601;
    public static final int CODE_TEXT_LIVE_SERVER_ERROR = 2605;
    public static final int CODE_TEXT_LIVE_UNAVAILABLE = 2604;
    public static final int CODE_TEXT_LIVE_WRONG_AUTHOR = 2602;
    public static final int CODE_TOKEN_CONFIRMATION_REQUIRED = 25;
    public static final int CODE_TOO_MANY_CHAT_USERS = 103;
    public static final int CODE_TOO_MANY_CONTACTS_TO_SYNC = 937;
    public static final int CODE_TOO_MANY_REQUESTS_PER_SECOND = 6;
    public static final int CODE_TOO_MANY_SIMILAR_REQUESTS = 9;
    public static final int CODE_UNKNOWN_ERROR = 1;
    public static final int CODE_UNKNOWN_METHOD = 3;
    public static final int CODE_USER_CONFIRM_REQUIRED = 24;
    public static final int CODE_USER_VALIDATION_REQUIRED = 17;
    public static final int CODE_USER_WAS_DELETED_OR_BANNED = 18;
    public static final int CODE_VIDEO_ALREADY_ADDED = 800;
    public static final int CODE_VK_PAY_INVALID_AMOUNT = 506;
    public static final int CODE_VK_PAY_INVALID_PIN = 509;
    public static final int CODE_VK_PAY_NOT_ENOUGH_MONEY = 504;
    public static final String EXTRA_ACCESS_TOKEN = "access_token";
    public static final String EXTRA_AUTH_ERROR = "error";
    public static final String EXTRA_CAPTCHA_IMG = "captcha_img";
    public static final String EXTRA_CAPTCHA_KEY = "captcha_key";
    public static final String EXTRA_CAPTCHA_SID = "captcha_sid";
    public static final String EXTRA_CONFIRM = "confirm";
    public static final String EXTRA_CONFIRMATION_TEXT = "confirmation_text";
    public static final String EXTRA_EXTENSION_HASH = "extend_hash";
    public static final String EXTRA_USER_BAN_INFO = "user_ban_info";
    public static final String EXTRA_VALIDATION_URL = "validation_url";
    public static final String EXTRA_VW_LOGIN_ERROR = "vw_login_error";
    public static final VKApiCodes INSTANCE = new VKApiCodes();
    public static final String PARAM_BAN_INFO = "ban_info";
    public static final String PARAM_CONFIRM_TEXT = "confirmation_text";
    public static final String PARAM_DEVICE_ID = "device_id";
    public static final String PARAM_ERROR = "error";
    public static final String PARAM_ERROR_CODE = "error_code";
    public static final String PARAM_EXECUTE_ERRORS = "execute_errors";
    public static final String PARAM_LANG = "lang";
    public static final String PARAM_REDIRECT_URI = "redirect_uri";
    public static final int SUBCODE_TOO_MANY_COMMUNITIES = 1;

    private VKApiCodes() {
    }
}
