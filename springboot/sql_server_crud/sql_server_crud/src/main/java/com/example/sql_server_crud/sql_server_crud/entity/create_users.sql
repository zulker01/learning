CREATE TABLE [dbo].[users](
    [id] [varchar](128) NOT NULL,
    [email] [varchar](128) NOT NULL,
    [first_name] [varchar](128) NOT NULL,
    [last_name] [varchar](128) NOT NULL,
    [first_name_bangla] [nvarchar](128) NULL,
    [last_name_bangla] [nvarchar](128) NULL,
    [nid] [varchar](32) NOT NULL,
    [password] [varchar](128) NOT NULL,
    [date_of_birth] [date] NOT NULL,
    [mobile_number] [varchar](16) NOT NULL,
    [has_to_change_password] [bit] NOT NULL,
    [password_reset_token] [varchar](128) NULL,
    [password_reset_token_expire_on] [datetime] NULL,
    [failed_login_attempt] [int] NOT NULL,
    [is_locked] [bit] NOT NULL,
    [otp] [varchar](8) NULL,
    [otp_expire_on] [datetime] NULL,
    [is_active] [bit] NOT NULL,
    CONSTRAINT [PK__users__3213E83FAE05FFB0] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
    CONSTRAINT [UK6dotkott2kjsp8vw4d0m25fb7] UNIQUE NONCLUSTERED
(
[email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
    ) ON [PRIMARY]
    GO