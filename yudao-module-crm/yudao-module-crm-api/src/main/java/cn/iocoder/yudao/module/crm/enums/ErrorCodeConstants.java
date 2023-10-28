package cn.iocoder.yudao.module.crm.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * CRM 错误码枚举类
 * <p>
 * crm 系统，使用 1-020-000-000 段
 */
public interface ErrorCodeConstants {

    // ========== 合同管理 1-020-000-000 ==========
    ErrorCode CONTRACT_NOT_EXISTS = new ErrorCode(1_020_000_000, "合同不存在");
    ErrorCode CONTRACT_TRANSFER_FAIL_PERMISSION_DENIED = new ErrorCode(1_020_000_001, "合同转移失败，原因：没有转移权限");
    ErrorCode CONTRACT_TRANSFER_FAIL_OWNER_USER_NOT_EXISTS = new ErrorCode(1_020_000_002, "合同转移失败，原因：负责人不存在");

    // ========== 线索管理 1-020-001-000 ==========
    ErrorCode CLUE_NOT_EXISTS = new ErrorCode(1_020_001_000, "线索不存在");

    // ========== 商机管理 1-020-002-000 ==========
    ErrorCode BUSINESS_NOT_EXISTS = new ErrorCode(1_020_002_000, "商机不存在");
    ErrorCode BUSINESS_TRANSFER_FAIL_PERMISSION_DENIED = new ErrorCode(1_020_002_001, "商机转移失败，原因：没有转移权限");
    ErrorCode BUSINESS_TRANSFER_FAIL_OWNER_USER_NOT_EXISTS = new ErrorCode(1_020_002_002, "商机转移失败，原因：负责人不存在");

    // TODO @lilleo：商机状态、商机类型，都单独错误码段

    ErrorCode BUSINESS_STATUS_TYPE_NOT_EXISTS = new ErrorCode(1_020_002_001, "商机状态类型不存在");
    ErrorCode BUSINESS_STATUS_NOT_EXISTS = new ErrorCode(1_020_002_002, "商机状态不存在");

    // ========== 联系人管理 1-020-003-000 ==========
    ErrorCode CONTACT_NOT_EXISTS = new ErrorCode(1_020_003_000, "联系人不存在");
    ErrorCode CONTACT_TRANSFER_FAIL_PERMISSION_DENIED = new ErrorCode(1_020_003_001, "联系人转移失败，原因：没有转移权限");
    ErrorCode CONTACT_TRANSFER_FAIL_OWNER_USER_NOT_EXISTS = new ErrorCode(1_020_003_002, "联系人转移失败，原因：负责人不存在");

    // TODO @liuhongfeng：错误码分段；
    ErrorCode RECEIVABLE_NOT_EXISTS = new ErrorCode(1_030_000_001, "回款管理不存在");

    ErrorCode RECEIVABLE_PLAN_NOT_EXISTS = new ErrorCode(1_040_000_001, "回款计划不存在");

    // ========== 客户管理 1_020_006_000 ==========
    ErrorCode CUSTOMER_NOT_EXISTS = new ErrorCode(1_020_006_000, "客户不存在");

}
